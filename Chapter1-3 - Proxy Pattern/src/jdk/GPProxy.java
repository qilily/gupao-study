package jdk;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 模拟Proxy
 *
 * @author HP-01
 * @create 2019/3/20
 */
public class GPProxy {

    public static final String LINE_END = "\r\n";

    public static Object newProxyInstance(GPClassLoader classLoader, Class<?> [] interfaces, GPInvocationHandler h) {
        try {
            // 动态生成源代码
            String source = generateSource(interfaces);

//            System.out.println(source);

            // 保存到磁盘，路径不能含空格
//            String filePath = GPProxy.class.getResource("").getPath();
            String filePath = "D:/";

//            System.out.println(filePath);

            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(source);
            fw.flush();
            fw.close();

            // 编译java文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            // 加载到JVM中
            Class proxyClass = classLoader.findClass("$Proxy0");


            System.out.println(proxyClass);

            Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
            f.delete();

            return c.newInstance(h);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSource(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package jdk;" + LINE_END);
        sb.append("import test.TargetObject;" + LINE_END);
        sb.append("import java.lang.reflect.*;" + LINE_END);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + " {" + LINE_END);
            sb.append("\tGPInvocationHandler h;" + LINE_END);
            sb.append("\tpublic $Proxy0(GPInvocationHandler h) {" + LINE_END);
                sb.append("\t\tthis.h = h;" + LINE_END);
            sb.append("\t}" + LINE_END);
            for (Method m : interfaces[0].getMethods()) {
                Class<?>[] params = m.getParameterTypes();

                StringBuffer paramNames = new StringBuffer();
                StringBuffer paramValues = new StringBuffer();
                StringBuffer paramClasses = new StringBuffer();

                for (int i = 0; i < params.length; i++) {
                    Class clazz = params[i];
                    String type = clazz.getName();
                    String paramName = toLowerFirstCase(clazz.getSimpleName());
                    paramNames.append(type + " " + paramName);
                    paramValues.append(paramName);
                    paramClasses.append(clazz.getName() + ".class");
                    if (i > 0 && i < params.length - 1) {
                        paramNames.append(",");
                        paramClasses.append(",");
                        paramValues.append(",");
                    }
                }

                sb.append("\tpublic " + m.getReturnType().getName() + " " + m.getName() + "(" + paramNames.toString() + ") {" + LINE_END);
                    sb.append("\t\ttry {" + LINE_END);
                        sb.append("\t\t\tMethod m = " + interfaces[0].getName() + ".class.getMethod(\""
                         + m.getName() + "\", new Class[]{ " + paramClasses.toString() + " });" + LINE_END);
                        sb.append((hasReturnValue(m.getReturnType()) ? "return " : "") + getCaseCode("\t\t\tthis.h.invoke(this, m, new Object[]{"
                                + paramValues + "})", m.getReturnType()) + ";" + LINE_END);
                    sb.append("\t\t} catch (Error _ex) { }" );
                    sb.append(" catch (Throwable e) {" + LINE_END);
                    sb.append("\t\t\tthrow new UndeclaredThrowableException(e);" + LINE_END);
                    sb.append("\t\t}" + LINE_END);
                    sb.append(getReturnEmptyCode(m.getReturnType()) + LINE_END);
                sb.append("\t}" + LINE_END);
            }
        sb.append("}" + LINE_END);
        return sb.toString();
    }

    private static Map<Class, Class> mappings = new HashMap<>();

    static {
        mappings.put(int.class, Integer.class);
    }

    private static String getReturnEmptyCode(Class<?> returnClass) {
        if (mappings.containsKey(returnClass)) {
            return "return 0;";
        } else if (returnClass == void.class) {
            return "";
        } else {
            return "return null;";
        }
    }

    private static String getCaseCode(String code, Class<?> returnClass) {
        if (mappings.containsKey(returnClass)) {
            return "((" + mappings.get(returnClass).getName() + ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }

    private static boolean hasReturnValue(Class<?> clazz) {
        return clazz != void.class;
    }

    private static String toLowerFirstCase(String simpleName) {
        char[] chars = simpleName.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }
}
