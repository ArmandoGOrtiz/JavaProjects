package IT212;

import java.util.Scanner;//add .scanner
public class TempDesc// was temp_desc has to match file name 
{   // two voids and change to public and [] added
    public static void main(String[] args)
    {
        // Instantiate scanner.
        Scanner scanner = new Scanner(System.in);// no quotes on system.in

        // Input temperature.
        System.out.print("Enter Fahrenheit temperature: ");
        double temp = Double.parseDouble(scanner.nextLine());

        //Obtain temperature descriptor changed to correct comment 
        String descrip;
        if (temp < 32.0) // () added
        {
            descrip = "Cold"; // ; added
        }
        else if (temp < 60.0)
        {
            descrip = "Chilly";
        }
        else if (temp < 75.0)
        {
            descrip = "Perfect";
        }
        else if (temp < 80.0)// change to if
        {
            descrip = "Warm"; // ; added and == is =
        } // } added
        else
        {
            descrip = "Hot";
        }
        System.out.println("Temperature Descriptor: "+ descrip);
    }}