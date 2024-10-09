package dip.shopping;

import dip.shopping.basket.ShoppingBasket;
import dip.shopping.interfaces.CreditCard;
import dip.shopping.interfaces.SqlDatabase;
import dip.shopping.utils.CreditCardImpl;
import dip.shopping.utils.Shopping;
import dip.shopping.utils.SqlDatabaseImpl;

public class Main {

    public static void main(String[] args) {
        SqlDatabase sqlDatabase = new SqlDatabaseImpl();
        CreditCard creditCard = new CreditCardImpl();
        Shopping shopping = new Shopping("Item 1", 20.0, 1);
        ShoppingBasket shoppingBasket = new ShoppingBasket(sqlDatabase, creditCard);
        shoppingBasket.buy(shopping);
    }
}
