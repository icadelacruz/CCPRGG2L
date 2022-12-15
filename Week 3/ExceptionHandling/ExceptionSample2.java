
package ExceptionHandling;

import java.util.*;

public class ExceptionSample2 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            int age;
            age = in.nextInt();
            testAge(age);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Still running");
    }
    
    public static void testAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Not eligible, the age should be 18 above");
        }
        System.out.println("Legal age");
    }
}
