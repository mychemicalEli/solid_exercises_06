package dip.shopping.basket;

import dip.shopping.interfaces.ShoppingItem;
import dip.shopping.utils.ShoppingImpl;
import dip.shopping.interfaces.CreditCard;
import dip.shopping.interfaces.SqlDatabase;

public class ShoppingBasket {

    private final SqlDatabase sqlDatabase;
    private final CreditCard creditCard;

    public ShoppingBasket(SqlDatabase sqlDatabase, CreditCard creditCard) {
        this.sqlDatabase = sqlDatabase;
        this.creditCard = creditCard;
    }

    public void buy(ShoppingItem shoppingItem) {
        sqlDatabase.save(shoppingItem);
        creditCard.pay(shoppingItem);
    }
}
