package model;

import annotation.BtaNumber;
import lesson10.interfaces.WithPerimeter;

public class Car implements WithPerimeter {

    @BtaNumber(min = 3_000, max = 100_000)
    private int price;

    @BtaNumber(min = 500, max = 3_000)
    private int weight;

    public Car(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }
}
