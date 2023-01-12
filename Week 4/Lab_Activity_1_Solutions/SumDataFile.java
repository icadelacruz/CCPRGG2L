import java.io.*;

public class SumDataFile {
    public static void main(String[] args) throws IOException, FileNotFoundException{
            File inFile = new File("data.txt");
            File outFile = new File("sum.txt");
            BufferedReader br = new BufferedReader(new FileReader(inFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
        try{
            int sum = 0;
            String s;
            while((s = br.readLine()) != null){
                sum += Integer.parseInt(s);
            }
            
            bw.write("Sum: "+sum);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            bw.flush();
            bw.close();
        }
    }
}
