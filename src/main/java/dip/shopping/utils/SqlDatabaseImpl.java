package dip.shopping.utils;

import dip.shopping.interfaces.SqlDatabase;

public class SqlDatabaseImpl implements SqlDatabase {
    @Override
    public void save(Shopping shopping) {
        System.out.println("Saving " + shopping.getItemName() + " to the database");
    }
}
