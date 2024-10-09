package dip.shopping.basket;

import dip.shopping.interfaces.CreditCard;
import dip.shopping.interfaces.SqlDatabase;
import dip.shopping.utils.Shopping;

public class ShoppingBasket {

    private final SqlDatabase sqlDatabase;
    private final CreditCard creditCard;

    public ShoppingBasket(SqlDatabase sqlDatabase, CreditCard creditCard) {
        this.sqlDatabase = sqlDatabase;
        this.creditCard = creditCard;
    }

    public void buy(Shopping shopping) {
        sqlDatabase.save(shopping);
        creditCard.pay(shopping);
    }
}
