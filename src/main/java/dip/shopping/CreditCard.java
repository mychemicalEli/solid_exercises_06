package dip.shopping;

public class CreditCard {
    public void pay(Shopping shopping) {
        System.out.println("Paying " + shopping.getPrice() + " using credit card");
    }
}
