package dip.shopping.utils;

import dip.shopping.interfaces.ShoppingItem;
import dip.shopping.interfaces.SqlDatabase;

public class SqlDatabaseImpl implements SqlDatabase {
    @Override
    public void save(ShoppingItem shoppingItem) {
        System.out.println("Saving " + shoppingItem.getItemName() + " to the database");
    }
}
