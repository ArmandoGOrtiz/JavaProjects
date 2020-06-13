package IT212;

import java.util.Scanner;
// ctrl + alt + n 
public class Greeter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Hello, " + name + ", how are you?");
        s.close();
        
    }
    
}