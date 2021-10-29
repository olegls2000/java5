package lesson10;

import utils.BtaUtils;

// public class Triangle {

    public class Triangle implements WithPerimeter {
        private int side;

        public Triangle() {
            side = BtaUtils.getRandom(3, 8);
        }

        @Override
        public int getPerimeter() {
            return 3 * side;
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