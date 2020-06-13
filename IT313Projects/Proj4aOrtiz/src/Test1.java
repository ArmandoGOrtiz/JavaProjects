/**
 * Armando Ortiz
 * 10/29/2019
 * Project 4a
 */
// import statements to get access to the classes
import Transaction.Transaction;
import Transaction.smartphoneTransaction;
import Transaction.laptopTransaction;

public class Test1 {
    public static void main(String[] args) {
        // The 4 objects created to test the classes
       Transaction p = new Transaction(1235, "Arny", "Walmart", 1200.50,
                "The seller Bestbuy is selling a product to the buyer Armando", "10/27/2019 at 4:30 pm");
       Transaction p2 = new Transaction(1235, "Matt", "Amazon", 180.6,
               "The seller Amazon is sell a product to buyer Matt", "10/30/2019 at 11:50 pm");
       smartphoneTransaction spt = new smartphoneTransaction(0334, "Josh","OnePlus",600,
                "The seller OnePlus is selling a smartphone to Josh ","11/26/2019 at 4:00 pm",3800,"Android, OxygenOS");
       laptopTransaction ltt = new laptopTransaction(2045, "Hayley", "Dell", 1999.99,
               "The seller Dell is selling a laptop to Hayley", "12/20/2019 at 11:15 am", "2 terabyte hhd","16 gigabytes of ram");

       // The first 4 print the objects
        System.out.println(p);
        System.out.println(p2);
        System.out.println(spt);
        System.out.println(ltt);
        System.out.println(p.compareTo(p2)); // Test the compareTo method will be 0 because the ids are the same
        // The next 6 will test the getter methods
        System.out.println(p.getId());
        System.out.println(p.getBuyer());
        System.out.println(p.getSeller());
        System.out.println(p.getAmount());
        System.out.println(p.getMemo());
        System.out.println(p.getTimeStamp());
        System.out.println(p.toString());

    }
}
