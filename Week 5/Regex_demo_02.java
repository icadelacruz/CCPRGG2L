package RegEx;

import java.util.*;

public class Regex_demo_02{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter text to match: ");
		String text = in.nextLine();

		// using matches()
		//String pattern = "coffee"; //this checks if the string coffee matches the entire string entered by the user
		//String pattern = "."; //this checks if any character matches the entire string
		//String pattern = "[abc]"; //this checks if the string either matches a or b or c
		//String pattern = "[abc][bcd][cde]"; //this checks if the string starts with a, b or c, followed by b,c or d then c,d or e
		//String pattern = "^[abc].*"; //this checks if the string starts with a or b or c
		//String pattern = ".*[def][abc]$"; //this checks if the string ends with a or b or c
		//String pattern = "[0-9]"; //this checks if the string is a non-digit string
//		String pattern = "[a-zA-F3-9]"; //this checks if the string matches small letter a-z or capital a-f or digits 3-9
		//String pattern = "[C|c]offee"; //this checks if the string matches coffee either with small c or capital C
		//String pattern = "[\\d]"; //this checks if the string is a digit
		//String pattern = "[\\D]"; //this checks if the string is a non-digit
//		String pattern = "[\\s]"; //this checks if the string is a whitespace character (\t, \n)
		//String pattern = "[\\S]"; //this checks if the string is a non-whitespace character (\t, \n)
		//String pattern = "[\\w]"; //this checks if the string is a word character ([a-zA-Z_0-9])
		//String pattern = "[\\W]"; //this checks if the string is a non-word character ([a-zA-Z_0-9])
		//String pattern = "[a-z]{8,16}"; //this checks if the regex preceded by the {} occured twice
                
                //String pattern = "(([A-Z][a-z]+\\s)+)";
                String pattern = "((^[1]{3})([01]*)([0]+)$)+";
		// using split()
		/*String [] slice = text.split(",");
		for(int i = 0; i < slice.length; i++){
			System.out.println(slice[i]);
		}*/

		//using replaceFirst() and replaceAll()
		//System.out.println(text.replaceFirst("\\s","*"));
		//System.out.println(text.replaceAll("\\s","\t"));

//                String pattern = "^[A-Z]{1}[a-z]*[\\s]$";

                if(text.matches(pattern)){
                    System.out.println("It's a match!");
                }
                else{
                    System.out.println("Not a match!");
                }
	}
}