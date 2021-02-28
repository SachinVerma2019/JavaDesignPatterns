package Behavioral.strategy.ShoppingMall;

public class Product {
    public String getSerialNumber() {
        return serialNumber;
    }

    public int getPrice() {
        return price;
    }

    private String serialNumber;
    private int price;

    public Product(String serialNumber, int price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }
}
