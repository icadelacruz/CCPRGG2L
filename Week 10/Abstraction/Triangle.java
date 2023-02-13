
package OOP;


public class Triangle extends Polygon{
    int a;
    int b;
    int c;
    
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int getPerimeter() {
        return a + b + c;
    }
    

    @Override
    public void getEdges() {
        System.out.println("Edges: "+this.getSides());
    }
    
    public static void main(String[] args) {

    }
    
}
