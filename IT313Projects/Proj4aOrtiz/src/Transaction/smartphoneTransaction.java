/**
 * Armando Ortiz
 * 10/29/2019
 * Project 4a
 */
package Transaction;

public class smartphoneTransaction extends Transaction {
// instance variables
    private int battery;
    private String os;
// the getter methods
    public int getBattery() {
        battery = 4000;
        return battery;
    }

    public String getOs() {
        os = "Android";
        return os;
    }
// toString method
    @Override
    public String toString() {
        return  super.toString() +"smartphoneTransaction{" +
                "battery=" + battery +
                ", os='" + os + '\'' +
                '}';
    }
// Constructor
    public smartphoneTransaction(int id, String b, String s, double amt, String m, String ts, int battery, String os) {
        super(id, b, s, amt, m, ts);
        this.battery = battery;
        this.os = os;

    }
}
