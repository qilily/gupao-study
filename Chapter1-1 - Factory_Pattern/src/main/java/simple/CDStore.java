package simple;

/**
 * 售卖CD的商店
 *
 * @author HP-01
 * @create 2019/3/15 21:54
 */
public class CDStore {

    SimpleCDFactory factory;

    public CDStore(SimpleCDFactory factory) {
        this.factory = factory;
    }

    public CD orderCD(CDType cdType) {
        CD cd;

        cd = factory.createCD(cdType);

        cd.box();
        return cd;
    }
}
