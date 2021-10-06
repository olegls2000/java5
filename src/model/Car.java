package model;
import utils.CarColor;

public class Car {
    private int price;
    private int weight;
    public CarColor carColor;

    public Car(int price, int weight, CarColor color) {
        this.price = price;
        this.weight = weight;
        this.carColor = color;

    }
}


