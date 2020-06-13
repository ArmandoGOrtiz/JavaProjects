/**
 * Armando Ortiz
 * 10/29/2019
 * Project 4a
 */
package Transaction;

public class laptopTransaction extends Transaction {
// instance variables
    private String  harddrive;
    private String ram;
// getter methods
    public String getHarddrive() {
        harddrive = "1 Terabyte hhd";
        return harddrive;
    }

    public String getRam() {
        ram = "16 gb";
        return ram;
    }
// toString method
    @Override
    public String toString() {
        return  super.toString() + "laptopTransaction{" +
                "harddrive='" + harddrive + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
// Constructor
    public laptopTransaction(int id, String b, String s, double amt, String m, String ts, String harddrive, String ram) {
        super(id, s, b, amt, m, ts);
        this.harddrive = harddrive;
        this.ram = ram;
    }
}
