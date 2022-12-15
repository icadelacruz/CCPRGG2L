
package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\National University\\Documents\\NetBeansProjects\\CCPRGG2L\\src\\ExceptionHandling\\input.txt");
        Scanner inFile = new Scanner(inputFile);
        
        try{
            while(inFile.hasNextLine()){
                System.out.println(inFile.nextLine());
            }
            System.out.println("");
        }
        catch(Exception e){
            System.out.println("An error has occurred: "+e.getMessage());
        }
        finally{
            inFile.close();
        }
    }
}
