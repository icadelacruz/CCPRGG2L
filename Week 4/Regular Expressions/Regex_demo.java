package RegEx;

import java.util.Scanner;

public class Regex_demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text to match: ");
        String text = in.nextLine();
        
        String pattern = "This"; //matches the word "This" with the ENTIRE string
//        String pattern = ".*[for].*"; //matches the word "for" in the String
//        String pattern = "^[This].*"; //matches a string that starts with "This"
//        String pattern = ".*[1]$"; //matches a string that ends with "1"
//        String pattern = "^[a-zA-Z0-9]*$"; //matches a string that starts and ends with either a letter or a digit
        if(text.matches(pattern)){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
