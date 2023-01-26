
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException{
        File file = new File("article.txt");
        
        try{
            File noNum = removeNumbers(file);
            File clean = removeCharacters(noNum);  
            countAcronyms(clean);
            convertToLower(clean);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public static File removeNumbers(File file) throws IOException, FileNotFoundException{
        File noNum = new File("no_numbers.txt");
        BufferedReader br_original = new BufferedReader(new FileReader(file));
        BufferedWriter bw_noNum = new BufferedWriter(new FileWriter(noNum));
        try{
            

            String text;
            String pattern = "(\\d)*";
        
            while((text = br_original.readLine()) != null){
                text = text.replaceAll(pattern, "");
                bw_noNum.write(text);
                bw_noNum.newLine();
            }
        
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            bw_noNum.flush();
            bw_noNum.close();      
        }
        return noNum;
        
    }
    
    public static File removeCharacters(File no_num) throws IOException, FileNotFoundException{
        File cleaned = new File("cleaned.txt");
        BufferedReader br = new BufferedReader(new FileReader(no_num));
        BufferedWriter bw_cleaned = new BufferedWriter(new FileWriter(cleaned));
        
        try{
            String text;
            String pattern = "[?!\\.,\\$()']*";
            
            while((text = br.readLine()) != null){
                text = text.replaceAll(pattern, "");
                bw_cleaned.write(text);
                bw_cleaned.newLine();
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            bw_cleaned.flush();
            bw_cleaned.close();
        }
        return cleaned;
    }
    
    public static void countAcronyms(File file) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String text;
        String pattern = ".*[A-Z]{2,}.*";
        int ctr = 0;
        while(((text = br.readLine()) != null)){
            String words [] = text.split(" ");
        
            for(String word: words){
                if(word.matches(pattern)){
                    ctr++;
                }
            }
        }
        System.out.println("Total: "+ctr);
    }
    
    public static String toLowerCase(String text){
        if(text.length() == 0){
            return "";
        }
        if(Character.isUpperCase(text.charAt(0))){
            char c = Character.toLowerCase(text.charAt(0));
            return c + "" + toLowerCase(text.substring(1));
        }
        return "" + text.charAt(0) + toLowerCase(text.substring(1));
    }
    
    public static void convertToLower(File cleaned) throws IOException, FileNotFoundException{
        File finalArticle = new File("final.txt");    
        BufferedReader br = new BufferedReader(new FileReader(cleaned));
        BufferedWriter bw_final = new BufferedWriter(new FileWriter(finalArticle));
        
        String text;
        try{
            while((text = br.readLine()) != null){
                bw_final.write(toLowerCase(text));
                bw_final.newLine();
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            bw_final.flush();
            bw_final.close();
        }
    }
}
