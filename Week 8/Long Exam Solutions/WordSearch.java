
package Exam;

import java.io.*;
import java.util.*;

public class WordSearch {
    public static void main(String[] args) throws IOException{
        File file = new File("big_bang.txt");
        
        System.out.println("Enter word to search: ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        search(file, word);
        
        int total_count = countWordInFile(file, word);
        System.out.println("Total count: "+total_count);
        
        if(total_count > 0){
            surroundWord(file,word);
            System.out.println("New file created.");
        }
        else{
            System.out.println("No new file created.");
        }
        
    }
    
    public static void search(File file, String word) throws IOException, FileNotFoundException{
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        try{
            String text;
            String pattern = "(?i)(.*)("+word+")(.*)";
            boolean found = false;
            while((text = br.readLine()) != null){
                if(text.matches(pattern)){
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println("Word found");
            }
            else{
                System.out.println("Word NOT found");
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static int countWordInFile(File file, String word) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));
        int count = 0;
        try{
            String text;
             
            while((text = br.readLine()) != null){
                count += countWords(text, word);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        return count; 
    }
    
    public static int countWords(String str, String word){
        
        if(str.length() < word.length()){
            return 0;
        }
        if(str.substring(0,word.length()).equalsIgnoreCase(word)){
            return 1 + countWords(str.substring(1),word);
        }
        return countWords(str.substring(1),word);
    }
    
    public static void surroundWord(File file, String word) throws IOException{
        File new_file = new File("checked.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new_file));
        
        try{
            String text;
            String pattern = "(?i)("+word+")";
            while((text = br.readLine()) != null){
                text = text.replaceAll(pattern, "#$1#");
                bw.write(text);
                bw.newLine();
            }
            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            bw.flush();
            bw.close();
        }
    }
}
