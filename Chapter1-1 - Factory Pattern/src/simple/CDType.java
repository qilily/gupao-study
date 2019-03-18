package simple;

/**
 * 光盘类型
 * @author HP-01
 * @date 22:26 2019/3/13
 */
public enum CDType {
    XBOXONE(0),
    PS4(1),
    SWITCH(2);

    private Integer num;

    CDType(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
