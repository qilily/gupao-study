package test;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author HP-01
 * @create 2019/3/19 15:43
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {
            TargetObject obj = (TargetObject) new JDKProxyObject().getInstance(new ProxyObject());
            obj.targetMethod();

            // 通过反编译工具可以查看源代码
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{TargetObject.class});
            FileOutputStream fos = new FileOutputStream("D://$Proxy0.class");
            fos.write(bytes);
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
