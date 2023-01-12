
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWordsInFile {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file to reverse: ");
        String s = in.nextLine();
        System.out.println("Enter file name for the reversed words: ");
        String outFile = in.nextLine();

//        String path = null;
        File file = new File(s);
        File reversed = new File("reversedLines.txt");
        
        if (file.exists()) {
//            path = file.getAbsolutePath();
            BufferedReader br = new BufferedReader(new FileReader(file));
            ArrayList<String> saveLines = new ArrayList<String>();

            try {
                String text;
                while ((text = br.readLine()) != null) {
                    saveLines.add(text);
                }
                
                BufferedWriter bw = new BufferedWriter(new FileWriter(reversed, true));
                for (int i = saveLines.size()-1; i >= 0; i--) {
                    bw.write(saveLines.get(i));
                    bw.newLine();
                }
                bw.flush();
                bw.close();

            } catch (Exception e) {
                System.out.println(e.getCause());
            }
        } else {
            System.out.println("File does not exist.");
        }
        
        reverseWords(reversed, outFile);

    }

    public static void reverseWords(File reversedLines, String outFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(reversedLines));
        int wordCount;
        String text;

        while ((text = br.readLine()) != null) {
            wordCount = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    wordCount++;
                }
            }
            ++wordCount;

            String word_array[] = new String[wordCount];
            int word = -1;
            int start_idx = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    word_array[++word] = text.substring(start_idx, i);
                    start_idx = i + 1;
                }
                if (i == text.length() - 1) {
                    word_array[++word] = text.substring(start_idx, i);
                }
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile, true));
            for (int i = word_array.length - 1; i >= 0; i--) {
                bw.write(word_array[i] + " ");
            }
            bw.newLine();
            bw.flush();
            bw.close();
        }

    }
}
