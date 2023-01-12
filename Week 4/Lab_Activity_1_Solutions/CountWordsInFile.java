
import java.io.*;
import java.util.Scanner;


public class CountWordsInFile {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String s = in.nextLine();
        int wordCount = 0;
        
        File file = new File(s);
        
        if(file.exists()){
//            path = file.getAbsolutePath();
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            try{
                String text;
                while((text = br.readLine()) != null){
                    for (int i = 0; i < text.length(); i++) {
                        if(text.charAt(i) == ' '){
                            wordCount++;
                        }
                    }
                    wordCount++; // to account for the last word
                }
                System.out.println(wordCount);
            }
            catch(Exception e){
                System.out.println(e.getCause());
            }
        }
        else{
            System.out.println("File does not exist.");
        }
        
        
    }
}
