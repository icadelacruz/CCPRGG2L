
package FileHandling;

import java.io.*;

public class BufferedWriterBW {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        File outFile = new File("output.txt");
        System.out.println("File path: "+outFile.getAbsolutePath());
        FileWriter fw = new FileWriter(outFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        try{
            bw.write("This is a text from the buffered writer.");
            bw.newLine();
            bw.write("This is another line from bw.");
        }
        catch(Exception e){
            System.out.println("Error has occured when writing file: "+e.getMessage());
        }
        finally{
            bw.flush();
            bw.close();
        }
    }
}

