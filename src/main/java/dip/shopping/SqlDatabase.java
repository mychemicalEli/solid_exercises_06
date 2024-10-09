package dip.shopping;

public class SqlDatabase {

    public void save(Shopping shopping) {
        System.out.println("Saving " + shopping.getItemName() + " to the database");
    }
}
