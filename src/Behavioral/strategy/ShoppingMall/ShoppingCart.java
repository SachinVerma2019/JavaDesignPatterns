package Behavioral.strategy.ShoppingMall;

import Behavioral.strategy.Payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }
    public void addProduct (Product p) {
        products.add(p);
    }
    public void removeProduct (Product p) {
        products.remove(p);
    }
    public void removeAll () {
        products.clear();
    }

    private int calculateTotal () {
        int total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void makePayment (Payment paymentMethod) {
        paymentMethod.pay(calculateTotal());
    }

}
