
package ExceptionHandling;

import java.io.*;
import java.util.Scanner;

public class ExceptionSample3 {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        try{
        File inFile = new File("C:\\Users\\National University\\Desktop\\input.txt");

        BufferedReader br = new BufferedReader(new FileReader(inFile));
        String text = br.readLine();
        while(text != null){
            System.out.println(text);
            text = br.readLine();
        }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
        System.out.println("Rest of the code ...");
    }
}
