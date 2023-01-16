import java.util.Scanner;

public class Regex_Exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        
        String pattern = "";
        if(input.matches(pattern)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
