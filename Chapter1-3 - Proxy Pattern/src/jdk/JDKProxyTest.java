package jdk;

import sun.misc.ProxyGenerator;
import test.JDKProxyObject;
import test.ProxyObject;
import test.TargetObject;

import java.io.FileOutputStream;

/**
 * @author HP-01
 * @create 2019/3/19 15:43
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {
            TargetObject obj = (TargetObject) new GPProxyObject().getInstance(new ProxyObject());
            System.out.println(obj.getClass());
            obj.targetMethod();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
