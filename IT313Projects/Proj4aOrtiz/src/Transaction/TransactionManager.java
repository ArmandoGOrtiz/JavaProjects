/**
 * Armando Ortiz
 * Project4b
 * 11/5/2019
 */
// All the import and package statement needed
package Transaction;
import java.util.*;
import java.io.*;
import java.util.function.Consumer;

public class TransactionManager implements
        Serializable, Iterable<Transaction> {
    // instance variable Arraylist
    private ArrayList<Transaction> col;
    //Constructor
    public TransactionManager( ) {

        col = new ArrayList<Transaction>( );
    }
    // adds to the Arraylist
    public void add(Transaction theTransaction){

        col.add(theTransaction);
    }
    // Clears Arraylist
    public void clear(){
        col.clear();
    }
    // Gets the size of the array list
    public int getCount(){
        return col.size();
    }
    // Sorts the arraylist by id
    public ArrayList getAll(){
        Collections.sort(col);
        return col;
    }
    // See if the buyer exist and sorts else it returns null
    public ArrayList getBuyer(String Buyer){
        for (Transaction t: col) {
            if (t.getBuyer().equals(Buyer)){
                Collections.sort(col);
                return col;
            }
        }
        return null;
    }
    // See if the Seller exist and sorts else it returns null
    public ArrayList getSeller(String Seller){
        for (Transaction t: col) {
            if (t.getSeller().equals(Seller)){
                Collections.sort(col);
                return col;
            }
        }
        return null;
    }

    public int findId(int theIndex){
        return theIndex;

    }

    public void save() throws IOException {
        ObjectOutputStream outStream =
                new ObjectOutputStream(
                        new FileOutputStream("Transaction.ser"));
        outStream.writeObject(col);
        outStream.close( );
    }

    public void load() throws IOException, ClassNotFoundException {
        {
            ObjectInputStream inStream =
                    new ObjectInputStream(
                            new FileInputStream("Transaction.ser"));
            col = (ArrayList<Transaction>) inStream.readObject( );
            inStream.close( );
    }}


    @Override
    public Iterator<Transaction> iterator() {
        return null;
    }

    @Override
    public Spliterator<Transaction> spliterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Transaction> action) {

    }

    @Override
    public String toString() {
        return "TransactionManager{" +
                "col=" + col +
                '}';
    }
}
