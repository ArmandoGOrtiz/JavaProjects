/**
 * Armando Ortiz
 * 10/29/2019
 * Project 4a
 */
// The import statement for the unit test
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Transaction.Transaction;
import Transaction.smartphoneTransaction;
import Transaction.laptopTransaction;

public class Test2 {
        Transaction p = new Transaction(1235, "Arny", "Walmart", 1200.50,
                "The seller Bestbuy is selling a product to the buyer Armando", "10/27/2019 at 4:30 pm");
        Transaction p2 = new Transaction(1235, "Matt", "Amazon", 180.6,
                "The seller Amazon is sell a product to buyer Matt", "10/30/2019 at 11:50 pm");
        smartphoneTransaction spt = new smartphoneTransaction(0334, "Josh","OnePlus",600,
                "The seller OnePlus is selling a smartphone to Josh ","11/26/2019 at 4:00 pm",3800,"Android, OxygenOS");
        laptopTransaction ltt = new laptopTransaction(2045, "Hayley", "Dell", 1999.99,
                "The seller Dell is selling a laptop to Hayley", "12/20/2019 at 11:15 am", "2 terabyte hhd","16 gigabytes of ram");
        // all the test that test the given methods so testToString will test teh toString method and so on
        @Test
        void testToString() {
                assertEquals("Transaction{id=1235, buyer='Arny', seller='Walmart', amount=1200.5, memo='The seller Bestbuy is selling a product to the buyer Armando', timeStamp='10/27/2019 at 4:30 pm'}", p.toString());

        }
        @Test
        void getId() {
                assertEquals(1234, p.getId());
        }

        @Test
        void getBuyer() {
                assertEquals("Armando", p.getBuyer());
        }

        @Test
        void getSeller() {
                assertEquals("Bestbuy", p.getSeller());
        }

        @Test
        void getAmount() {
                assertEquals(1800.5, p.getAmount());
        }

        @Test
        void getMemo() {
                assertEquals("The seller Bestbuy is selling a product to the buyer Armando",
                        p.getMemo());
        }

        @Test
        void getTimeStamp() {
                assertEquals("10/27/2019 at 4:30 pm",
                        p.getTimeStamp());
        }
        @Test
        void getBattery(){
                assertEquals(4000, spt.getBattery());

        }
        @Test
        void getOs(){
                assertEquals("Android",spt.getOs());
        }
        @Test
        void getharddrive(){
                assertEquals("1 Terabyte hhd", ltt.getHarddrive());
        }
        @Test
        void getram(){
                assertEquals("16 gb", ltt.getRam());

        }
        @Test
        void compareTo(){
                assertEquals(0, p.compareTo(p2));

        }
    }
