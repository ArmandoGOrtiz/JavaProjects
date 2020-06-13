/**
 * Armando Ortiz
 * Project 3a
 * 10/8/19
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
public class PostNet {
    // Create instance variables that can be used in the entire class
    private static String [] barcode = {"I","II:::",":::II","::I:I","::II:",":I::I",":I:I:",":II::","I:::I","I::I:","I:I::"};
    private static String digits = "-0123456789";
    private static String initial = "I";
    private static String terminal = "I";


    public static void main(String[] args) throws FileNotFoundException {
        // Tells user to select a file to read
        JFileChooser chooser = new JFileChooser( );
        chooser.showOpenDialog(null);
        File fileObj = chooser.getSelectedFile( );
        // Creates scanner object that reads the chosen file
        Scanner in = new Scanner(fileObj);
        // Creates printwriter object called pw that writes in created file called labels.txt
        PrintWriter pw = new PrintWriter("labels.txt");
        // Created array list object
        ArrayList<Integer> sum = new ArrayList<>();
        // Initialize sumOfDigits and checksum variable
        int sumOfDigits = 1;
        int checksum = 0;
        in.useDelimiter(",");
        // Goes through chosen file and prints each word in a new line after it is split with a ","
        while (in.hasNext( )) {
            String word = in.next();
            pw.println(word);
            // When zipcode is chosen add numbers to the list
            if (word.length() == 10) {
                for (int i = 0; i < word.length() ; i++) {
                    sum.add(Character.getNumericValue(word.charAt(i)));
                }
                // Create sum of the array list
                for (int i = 0; i < sum.size() ; i++) {
                    sumOfDigits +=sum.get(i);
                    // once array list size is reached do checksum
                    if (i == sum.size() - 1){
                        checksum = (10 - sumOfDigits % 10) % 10;
                    }
                }
                // write out the code and words into the new file
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    int index = digits.indexOf(c);
                    String code = barcode[index];
                    if (i == 0){pw.print(initial + " " + code);}
                    pw.print(code);
                    if (i == word.length() - 1){pw.print(code + " " + barcode[checksum + 1] + " " + terminal);}
                }
            }
        }
        // close print writer and scanner
        pw.close( );
        in.close( );
        System.out.println(PostNet.getBarCode("80236-2982"));
    }
    public static String getBarCode(String zipcode) throws FileNotFoundException {
        // create sting retval to be return
        // the rest is a repeat of comments above
        String retVal = "";
        ArrayList<Integer> sum = new ArrayList<>();
        int sumOfDigits = 1;
        int checksum = 0;
        for (int i = 0; i < zipcode.length() ; i++) {
            sum.add(Character.getNumericValue(zipcode.charAt(i)));
        }

        for (int i = 0; i < sum.size() ; i++) {
            sumOfDigits +=sum.get(i);
            if (i == sum.size() - 1){
                checksum = (10 - sumOfDigits % 10) % 10;
            }
        }

        for(int i = 0; i < zipcode.length( ); i++) {
            char c = zipcode.charAt(i);
            int index = digits.indexOf(c);
            String code = barcode[index];
            retVal += code;
        }
        // return barcode
        return initial + " " + retVal + " " + barcode[checksum + 1] + " " + terminal;
    }
}
