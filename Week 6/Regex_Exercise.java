
package RegEx;

import java.util.Scanner;

public class Regex_Exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        
        //String pattern = "^[(](\\d{3}[)](\\d{3)-(\\d{4})$";
        //String pattern = "((0[1-9])|(1[12]))/((0[1-9])|([12]\\d)|(3[01]))/(000[1-9]|([12]\\d{3}))";
//        String pattern = "[a-zA-Z0-9]+";
        String pattern = "([A-Z][a-z]*(\\s*[a-z]*)*)+";
        if(input.matches(pattern)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
