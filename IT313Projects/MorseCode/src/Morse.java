public class Morse {
// Source code file Morse.java
        public static String toMorseCode(String input) {
            String chars = " ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            String[ ] codes = {"   ", ".-", "-...", "-.-.", "-..",
                    ".", "..-.", "--.", "....", "..", ".---", "-.-",
                    ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                    "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                    "--..", ".----", "..---", "...--", "....-", ".....",
                    "-....", "--...", "---..", "----.", "-----"};
            String retVal = "";
            for(int i = 0; i < input.length( ); i++) {
                char c = input.charAt(i);
                int index = chars.indexOf(c);
                String code = codes[index];
                retVal += code + " ";
            }
            return retVal;
        }
    }

