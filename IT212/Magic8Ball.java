// Armando Ortiz
// 6-11-19
// Project 6
package IT212;

// Import random and scanner modual
import java.util.Random;
import java.util.Scanner;
// The class header
public class Magic8Ball {
    // get_production method
    static void get_prediction( ){
    {   // simulates a magic 8 ball with 8 answers 
        Random r = new Random( );
        int roll = r.nextInt(6) + 1;

        if (roll == 1){
            System.out.println("Yes -- definitely");
        }
        else if (roll == 2){
            System.out.println("Most likely");
        } 
        else if (roll == 2){
            System.out.println("Reply hazy, try again");
        } 
        else if (roll == 4){
            System.out.println("Cannot predict now");
        } 
        else if (roll == 5){
            System.out.println("Don't count on it");
        } 
        else {
            System.out.println("Very doubtful");
        } 
    } 
}

// main class 
public static void main(String[] args) {
    // creates scannner object and allows for one predicton
    Scanner myObj = new Scanner(System.in);
    String userName;
    int again = 1;
    get_prediction();  
    // while loop that if you want to you can get more predictions by inputing 1 otherwise it ends
    while (again != 0) {

        System.out.print("Do you want another Magic 8-Ball prediction? Enter 1 for yes, 0 for no: "); 
        userName = myObj.nextLine();   
        if (Integer.parseInt(userName) == 1) {
        System.out.println("Username is: " + userName);
        get_prediction();  
        }
        else {
            System.out.println("Goodbye");
            again = 0;
            myObj.close();   
        }   
    }
    }
}
