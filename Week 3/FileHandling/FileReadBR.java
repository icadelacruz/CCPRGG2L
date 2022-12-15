
package FileHandling;

import java.io.*;

public class FileReadBR {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        File inFile = new File("C:\\Users\\National University\\Documents\\NetBeansProjects\\CCPRGG2L\\src\\ExceptionHandling\\input.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        
        try{
            String text;
            while((text = br.readLine()) != null){
                System.out.println(text);
            }
        }
        catch(Exception e){
            System.out.println("There is an error reading the file: ");
            System.out.println(e.getMessage());
        }
        finally{
            br.close();
        }
    }
}
