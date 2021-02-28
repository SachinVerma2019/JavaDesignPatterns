package Behavioral.strategy.Payment;

import java.util.Date;

public class CreditCard implements Payment{
    private String name;
    private String expiryDate;
    public CreditCard(String name, String expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
    @Override
    public void pay(int money) {
        System.out.println("Paying money " + money + " with Credit Card");
    }
}
