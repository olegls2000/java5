package model;

public class Car {
    private static final int MIN_PRICE = 80000;
    private static final int MAX_PRICE = 400000;

    private static final int MIN_WEIGHT = 1200;
    private static final int MAX_WEIGHT = 2500;

    private int price;
    private int weight;

    public enum colour {
        RED, WHITE, BLACK
    }

    public Car(int price, int weight, String colour) {
        priceCheck(price);
        this.price = price;
        weightCheck(weight);
        this.weight = weight;
        colourCheck(colour);
        this.colour = colour;

    }

    private void colourCheck(String colour) {
        switch (colour) {
            case RED :

            case WHITE :

            case BLACK :

        }


    }

    private void priceCheck(int price) {
        if (price < MIN_PRICE || price > MAX_PRICE) {
            System.out.println("Car price (" + price + "EURO) is invalid !" +
                    "Price must be in range [" + MIN_PRICE + " - " + MAX_PRICE + "]");
            throw new RuntimeException();
        }
    }

    private void weightCheck(int weight) {
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            System.out.println("Car weight (" + weight + "Kg) is invalid !" +
                    "Weight must be in range [" + MIN_WEIGHT + " - " + MAX_WEIGHT + "]");
            throw new RuntimeException();
        }
    }



    public void setPrice(int price) {
        priceCheck(price);
        this.price = price;
    }

    public void setWeight(int weight) {
        weightCheck(weight);
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}
