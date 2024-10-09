package dip.shopping.utils;

import dip.shopping.interfaces.CreditCard;
import dip.shopping.interfaces.ShoppingItem;

public class CreditCardImpl implements CreditCard {
    @Override
    public void pay(ShoppingItem shoppingItem) {
        System.out.println("Paying " + shoppingItem.getPrice() + " using credit card");
    }
}
