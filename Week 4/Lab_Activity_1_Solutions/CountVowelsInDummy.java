import java.io.*;

public class CountVowelsInDummy {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file = new File("dummy.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        try{
            String line;
            int ctr = 0;
            while((line = br.readLine()) != null){
                for(int i = 0; i < line.length(); i++){
                    char letter = Character.toLowerCase(line.charAt(i));
                    if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                        ctr++;
                    }
                }
            }
            System.out.println("Vowel count: "+ctr);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
