package simple;

import static simple.CDType.XBOXONE;

/**
 * @author HP-01
 * @create 2019/3/13 22:54
 */
public class SimpleCDFactoryTest {

    public static void main(String[] args) {
        CDStore cdStore = new CDStore(new SimpleCDFactory());
        CD cd = cdStore.orderCD(XBOXONE);
        System.out.println(cd);
    }
}
