
package RegEx;

import java.util.Scanner;

public class LookAhead {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        
//        String pattern = "(.*(?=[0-9])*)*";
        String pattern = "(?i)coffee";
        if(text.matches(pattern)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
