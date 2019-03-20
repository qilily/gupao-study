package test;

/**
 * @author HP-01
 * @create 2019/3/19 15:55
 */
public class ProxyObject implements TargetObject {

    @Override
    public void targetMethod() {
        System.out.println("找到目标方法，进行代理");
    }
}
