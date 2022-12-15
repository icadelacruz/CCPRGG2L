
package FileHandling;

import java.io.*;

public class CreateFile {
    
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        
        try{
           if(!file.exists()){
                file.createNewFile();
                System.out.println(file.getName() + " successfully created");
                System.out.println(file.getAbsolutePath());
            }
            else{
                System.out.println(file.getName() + " already exists.");
                System.out.println(file.getAbsolutePath());
                System.out.println(file.length());
                file.delete();
                System.out.println("File already deleted.");
                
            } 
        }
        catch(IOException e){
            System.out.println("There is an error: ");
            System.out.println(e.getMessage());
        }
        
    }
}
