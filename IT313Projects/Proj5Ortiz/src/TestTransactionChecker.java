/**
 * Armando Ortiz
 * 11/19/2019
 * Project 5
 */
import java.io.FileNotFoundException;

public class TestTransactionChecker extends TransactionChecker{
    public TestTransactionChecker(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    public static void main(String[] args) throws FileNotFoundException {
        // TransactionChecker object created
        TransactionChecker c = new TransactionChecker("transaction.txt");
        // Transaction logger object created
        TransactionLogger l = new TransactionLogger();

    }
}
