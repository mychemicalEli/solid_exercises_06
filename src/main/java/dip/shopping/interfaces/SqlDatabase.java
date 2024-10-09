package dip.shopping.interfaces;

import dip.shopping.utils.ShoppingImpl;

public interface SqlDatabase {
    void save (ShoppingItem shoppingItem);
}
