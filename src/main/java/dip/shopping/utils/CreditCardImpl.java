package dip.shopping.utils;

import dip.shopping.interfaces.CreditCard;

public class CreditCardImpl implements CreditCard {
    @Override
    public void pay(Shopping shopping) {
        System.out.println("Paying " + shopping.getPrice() + " using credit card");
    }
}
