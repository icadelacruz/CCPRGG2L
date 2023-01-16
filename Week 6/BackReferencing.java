package RegEx;

import java.util.Scanner;

public class BackReferencing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

//        String pattern = "([\\w]*)([?!.,])+";
        String pattern = "(\\w)(\\s)(\\d)\\1{2}";
//        System.out.println(text.replaceAll(pattern, "$1"));
        if(text.matches(pattern)){
            System.out.println("Pattern found");
        }
        else{
            System.out.println("Pattern not found");
        }
    }
}
