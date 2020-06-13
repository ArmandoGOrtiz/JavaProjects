/**
 * Armando Ortiz
 * 11/19/2019
 * Project 5
 */
// Source Code Cile: TransactionChecker.java
// For Project 5.
// To be modified.
// import statements
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TransactionChecker extends Transaction implements Observable {
    Scanner inputScanner;

    public TransactionChecker(String fileName)
            throws FileNotFoundException {
        super(1001, "null","null",0.0,"null","null");
        inputScanner = new Scanner(new File(fileName));
    }

    public void checkTransactions( ) {

        // Throw away first line
        inputScanner.nextLine( );

        while(inputScanner.hasNextLine( )) {
            String line = inputScanner.nextLine( );
            // creates Transaction object
            Transaction p = new Transaction(1001, "null","null",0.0,"null","null");
            if (p.getAmount() > 50000 && p.getBuyer().equals("Eugene Eko")){
                // set change used
                setChange();
                // notifyObservers used
                notifyObservers();
            }
        }
        inputScanner.close( );
    }

    public void setChange() {
    }

    public void notifyObservers(){

    }

    @Override
    public void addListener(InvalidationListener invalidationListener) {

    }

    @Override
    public void removeListener(InvalidationListener invalidationListener) {

    }
}