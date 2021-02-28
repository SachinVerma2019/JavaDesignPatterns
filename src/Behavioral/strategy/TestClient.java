package Behavioral.strategy;

import Behavioral.strategy.Payment.CreditCard;
import Behavioral.strategy.Payment.EWallet;
import Behavioral.strategy.ShoppingMall.Product;
import Behavioral.strategy.ShoppingMall.ShoppingCart;

import java.util.Date;

public class TestClient {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("abc", 32));
        cart.addProduct(new Product("def", 45));
        cart.addProduct(new Product("xyz", 50));
        cart.addProduct(new Product("t124", 13));
        CreditCard card = new CreditCard("Sachin Verma", "Jan-2024");
        EWallet wallet = new EWallet("7885476574", "ForgetIt");
        cart.makePayment(card);
        cart.removeAll();
        cart.addProduct(new Product("lkhjhd", 100));
        cart.makePayment(wallet);
    }
}
