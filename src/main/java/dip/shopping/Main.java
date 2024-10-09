package dip.shopping;

public class Main {

    public static void main(String[] args) {

        Shopping shopping = new Shopping("Item 1", 20.0, 1);
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.buy(shopping);
    }
}
