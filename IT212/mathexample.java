
package IT212;
import java.util.Scanner;
// ctrl + alt +n
public class mathexample{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of blocks East or West from city center: ");
        String input1 = s.nextLine();
        double x = Double.parseDouble(input1);

        System.out.print("Enter number of blocks North or South from city center:");
        String input2 = s.nextLine();
        double y = Double.parseDouble(input2);

        double distance = Math.sqrt(x * x + y * y);
        System.out.println("Distance: " + distance);
        s.close();
    }
}