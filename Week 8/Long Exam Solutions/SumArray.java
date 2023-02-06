
package Exam;

import java.io.*;
import java.util.ArrayList;

public class SumArray {
    public static void main(String[] args) throws IOException {
        File file = new File("usernames.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList <Integer> al = new ArrayList<>();
        
        String text;
        String regex = "(.*)(\\d{2})(.*)";
        
        while((text = br.readLine()) != null){
            if(text.matches(regex)){
                text = text.replaceAll(regex, "$2");
                al.add(Integer.parseInt(text));
            }
        }
        
        System.out.println("Array elements: ");
        
        for(int i: al){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("Sum: "+computeSum(al,0));   
    }
    
    public static int computeSum(ArrayList num, int idx){
        if(idx == num.size()) return 0;
        return (int) num.get(idx) + computeSum(num, ++idx);     
    }
}
