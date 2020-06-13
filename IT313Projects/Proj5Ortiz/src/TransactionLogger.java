/**
 * Armando Ortiz
 * 11/19/2019
 * Project 5
 */
// Source code file TransactionLogger.java
// For Project 5.
// To be modified.
// import statement
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Observable;
import java.util.Observer;

public class TransactionLogger implements Observer {
    PrintWriter log;

    public TransactionLogger(String fileName)
            throws FileNotFoundException {
        log = new PrintWriter(fileName);
    }
// Constructor
    public TransactionLogger() {

    }

    public void close( ) {
        log.close( );
    }

    @Override
    public void update(Observable observable, Object o) {

    }
}