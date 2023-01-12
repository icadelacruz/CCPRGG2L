import java.io.*;

public class First5 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file = new File("dummy.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        try{
            String line;
            int ctr = 0;
            while((line = br.readLine()) != null){
                if(ctr == 5) break;
                System.out.println(line);
                ctr++;
                
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
