package dip.shopping;

import dip.shopping.basket.ShoppingBasket;
import dip.shopping.interfaces.CreditCard;
import dip.shopping.interfaces.SqlDatabase;
import dip.shopping.utils.CreditCardImpl;
import dip.shopping.utils.ShoppingImpl;
import dip.shopping.utils.SqlDatabaseImpl;

public class Main {

    public static void main(String[] args) {
        SqlDatabase sqlDatabase = new SqlDatabaseImpl();
        CreditCard creditCard = new CreditCardImpl();
        ShoppingImpl shoppingImpl = new ShoppingImpl("Item 1", 20.0, 1);
        ShoppingBasket shoppingBasket = new ShoppingBasket(sqlDatabase, creditCard);
        shoppingBasket.buy(shoppingImpl);
    }
}
