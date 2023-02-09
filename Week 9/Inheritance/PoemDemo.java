
package OOP;

public class PoemDemo {
    public static void main(String[] args) {
        Poem p = new Poem("Poem",10);
        Couplet c = new Couplet("Couplet");
        Limerick l = new Limerick("Limerick");
        Haiku h = new Haiku("Haiku");
        
        System.out.println(p.getTitle() + " - " +p.getLines() +" lines");
        System.out.println(c.getTitle() + " - " +c.getLines() +" lines");
        System.out.println(l.getTitle() + " - " +l.getLines() +" lines");
        System.out.println(h.getTitle() + " - " +h.getLines() +" lines");
    }
}
