package model;

public class Car2 {
    private int price;
    private int weight;

    private static final int MIN_PRICE = 80_000;
    private static final int MAX_PRICE = 400_000;

    public Car2 (int price, int weight){
        priceCheck(price);
        this.price = price;
        this.weight = weight;
    }

    private void priceCheck(int price){
        if (price < MIN_PRICE || price > MAX_PRICE){
            System.out.println("Car price (" + price + " EURO) is invalid!" +
                    "Must be in range [" + MIN_PRICE + "," + MAX_PRICE + "]");
            throw new RuntimeException();
        }
    }

    public void setPrice(int price){
        priceCheck(price);
        this.price = price;
    }

}

