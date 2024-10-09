package dip.shopping;

public class ShoppingBasket {

    private final SqlDatabase sqlDatabase;
    private final CreditCard creditCard;

    public ShoppingBasket() {
        this.sqlDatabase = new SqlDatabase();
        this.creditCard = new CreditCard();
    }

    public void buy(Shopping shopping) {
        sqlDatabase.save(shopping);
        creditCard.pay(shopping);
    }
}
