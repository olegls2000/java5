package model;

public class Car {
    private int price;
    private int weight;

    private static final int MIN_PRICE = 3_000;
    private static final int MAX_PRICE = 100_000;

    private static final int MIN_WEIGHT = 1_200;
    private static final int MAX_WEIGHT = 2_500;

    public Car(int price, int weight) {
        priceCheck(price);
        weightCheck(weight);
        this.price = price;
        this.weight = weight;
    }

    private void priceCheck(int price) {
        if (price < MIN_PRICE || price > MAX_PRICE) {
            System.out.println("Car price (" + price + " EURO) is invalid!" +
                    "Must be in range [" + MIN_PRICE + "," + MAX_PRICE + "]");
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

    private void weightCheck(int weight) {
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            System.out.println("Car weight (" + weight + " KG) is invalid" +
                    "Must be in range [" + MIN_WEIGHT + "," + MAX_WEIGHT + "]");
            throw new RuntimeException();
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

