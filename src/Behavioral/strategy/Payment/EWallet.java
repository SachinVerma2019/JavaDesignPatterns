package Behavioral.strategy.Payment;

public class EWallet implements Payment {
    private String phoneNumber;
    private String password;

    public EWallet(String phone, String password) {
        this.phoneNumber = phone;
        this.password = password;
    }
    @Override
    public void pay(int money) {
        System.out.println("Paying : " + money + " from EWallet");
    }
}
