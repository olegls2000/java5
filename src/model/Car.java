package model;

import lesson10.interfaces.WithPerimeter;

public class Car implements WithPerimeter {
    private static final int MIN_PRICE = 3_000;
    private static final int MAX_PRICE = 100_000;

    private int price;
    private int weight;

    public Car(int price, int weight) {
        priceCheck(price);
        this.price = price;
        this.weight = weight;
    }

    private void priceCheck(int price) {
        if (price < MIN_PRICE || price > MAX_PRICE) {
            System.out.println("Car price (" + price + " EURO) is invalid! " +
                    "Must be in a range [" + MIN_PRICE + "," + MAX_PRICE + "]");
            throw new RuntimeException();
        }
    }

    public void setPrice(int price) {
        priceCheck(price);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public int getPerimeter() {
        return 0;
    }
}