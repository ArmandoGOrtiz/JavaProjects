/*
Armando Ortiz
9-16-19
Project 1
*/
import java.util.Scanner;
// import the scanner module
// public class MetarAbbriv
public class MetarAbbriv {
        public static void main(String[] args) {
            // names all 8 cases required for the project as a1-a8
            String a1 = "+";
            String a2 = "-";
            String a3 = "B";
            String a4 = "DZ";
            String a5 = "E";
            String a6 = "HZ";
            String a7 = "RA";
            String a8 = "SN";
            Scanner s = new Scanner(System.in);
            // A prompt comes up to enter the abbreviation
            System.out.print("Enter your METAR abbreviation: ");
            String code = s.nextLine();
            // Depending on what was typed in a different meaning comes up if not unknown abbreviation comes up
            if (code.equals(a1)){
                System.out.println("Heavy Intensity");
            }
            else if (code.equals(a2)){
                System.out.println("Light Intensity");
            }
            else if (code.equals(a3)){
                System.out.println("Began at time");
            }
            else if (code.equals(a4)){
                System.out.println("Drizzle");
            }
            else if (code.equals(a5)){
                System.out.println("Ended at Time");
            }
            else if (code.equals(a6)){
                System.out.println("Haze");
            }
            else if (code.equals(a7)){
                System.out.println("Rain");
            }
            else if (code.equals(a8)){
                System.out.println("Snow");
            }
            else {
                System.out.println("Unknown Abbreviation");
            }
            // scanner is closed
            s.close();

        }
    }
