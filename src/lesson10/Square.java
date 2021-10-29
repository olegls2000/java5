package lesson10;

import utils.BtaUtils;

public class Square implements WithPerimeter {

    private int side;

    public Square() {
        this.side = BtaUtils.getRandom(3, 6);
    }

//    @Override
//    public String getCode() {
//        return "SQUARE";
//    }
//
//    @Override
//    public long getId() {
//        return 1L;
//    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public long getId() {
        return 0;
    }
}
