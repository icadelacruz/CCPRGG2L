public class Regex_demo_01 {
    public static void main(String[] args) {
        String text = "I jumped";
        String pattern = "........";
        System.out.println(text.matches("I.*"));
        String words[] = text.split(" ");
        
        for(String word : words){
            System.out.println(word);
        }
        
        System.out.println(text.replaceFirst(pattern, "*"));
        System.out.println(text.replaceAll(pattern, "*"));
        System.out.println(text.matches(pattern));
    }
}
