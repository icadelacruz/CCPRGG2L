
package OOP;


public class Poem {
    String title;
    int lines;
    
    public Poem(String title, int lines){
        this.title = title;
        this.lines = lines;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getLines(){
        return this.lines;
    }
    
//    public static void main(String[] args) {
//        Poem poem = new Poem("This is a song",10);
////        String title = poem.getTitle();
//        System.out.println(poem.getTitle());
//    }
}
