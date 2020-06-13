package IT212;

import java.util.Random;

public class RandomNum{
    public static void main(String[] args) {
        
        Random r = new Random();
        int die1Result = r.nextInt(6) + 1;
        int die2Result = r.nextInt(6) + 1;
        System.out.println(die1Result+ " " + die2Result);
    }
}