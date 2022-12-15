package ExceptionHandling;

import java.util.Scanner;

public class ExceptionSample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int x = in.nextInt();
            int y = in.nextInt();

            System.out.println(y / x);
            System.out.println("Hello");
        } 
        catch (ArithmeticException e) {
            //System.out.println("Math error");
            //Use methods for printing exceptions
            System.out.println(e.toString());
            e.printStackTrace();
            
        } 
        //The catch block below catches all types of exceptions not handled by the previous catch blocks.
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally {
            System.out.println("This always runs");
        }
       
         System.out.println("This is another line in the program");
    }
}
