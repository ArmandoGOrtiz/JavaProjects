/**
 * Armando Ortiz
 * Project4b
 * 11/5/2019
 */

import Transaction.Transaction;
import Transaction.TransactionManager;

import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Transaction p = new Transaction(1890, "Armando", "Bestbuy", 1200.50,
                "The seller Bestbuy is selling a product to the buyer Armando", "10/27/2019 at 4:30 pm");
        Transaction p2 = new Transaction(1236, "Matt", "Amazon", 180.6,
                "The seller Amazon is sell a product to buyer Matt", "10/30/2019 at 11:50 pm");
        TransactionManager tm = new TransactionManager();
        // Test the add method with the Transaction objects above
        tm.add(p);
        tm.add(p2);
        System.out.println(tm);
        // testing the all the get methods
        System.out.println(tm.getCount());
        System.out.println(tm.getAll());
        System.out.println(tm.getBuyer("Armando"));
        System.out.println(tm.getBuyer("Rick"));
        System.out.println(tm.getSeller("Bestbuy"));
        System.out.println(tm.getSeller("Target"));
        System.out.println(tm.findId(1236));
        // Test clear method
        tm.clear();
        System.out.println(tm);

    }
}
