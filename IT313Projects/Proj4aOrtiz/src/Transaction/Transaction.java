/**
 * Armando Ortiz
 * 10/29/2019
 * Project 4a
 */
// Shows location of Transaction.java
package Transaction;
// implement interface compareable
public class Transaction implements Comparable<Transaction> {
// All the instance variables
    private int id;
    private String buyer;
    private String seller;
    private Double amount;
    private String memo;
    private String timeStamp;
// toString method
    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", buyer='" + buyer + '\'' +
                ", seller='" + seller + '\'' +
                ", amount=" + amount +
                ", memo='" + memo + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                '}';
    }
// Transaction constructor with the instance variables
    public Transaction(int id, String buyer, String seller, Double amount, String memo, String timeStamp) {
        this.id = id;
        this.buyer = buyer;
        this.seller = seller;
        this.amount = amount;
        this.memo = memo;
        this.timeStamp = timeStamp;
    }

// All the getter methods
    public int getId() {
        id = 1234;
        return id;
    }

    public String getBuyer() {
        buyer = "Armando";
        return buyer;
    }

    public String getSeller() {
        seller = "Bestbuy";
        return seller;
    }

    public Double getAmount() {
        amount = 1800.50;
        return amount;
    }

    public String getMemo() {
        memo = "The seller Bestbuy is selling a product to the buyer Armando";
        return memo;
    }

    public String getTimeStamp() {
        timeStamp = "10/27/2019 at 4:30 pm";
        return timeStamp;
    }
// Compareto method
    @Override
    public int compareTo(Transaction other) {
        if (this.id > other.id){
            return 1;
        }
        else if (this.id < other.id){
            return -1;
        }
        else {
            return 0;
        }
    }
}
