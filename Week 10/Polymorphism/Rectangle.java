

package OOP;


public class Rectangle extends Shape{
    
    double length;
    double width;
    
    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
        this.setColor("white");
    }
    
    // method overloading
    public void render(String color){
        System.out.println("Rendering rectangle with color "+this.getColor());
    }
    
    // method overriding
    @Override
    public void render(){
        System.out.println("Rendering Rectangle ...");
    }
    
    @Override
    public double getArea(){
        return this.length * this.width;
    }
    
    // overloading
    public double getArea(double length, double width){
        return length * width;
    }
    
    public void drawRect(){
        System.out.println("Drawing rectangle");
    }
    
    public static void main(String[] args) {
        // compile time binding
        Shape s = new Shape("Red");
        
        Rectangle r = new Rectangle(12,15.5);
        
        // Subtype polymorphism
        // Upcasting (implicit)
        Shape s1 = new Rectangle(10,15);
        double area = s1.getArea();
        System.out.println("Area: "+ area);
        
        // Downcasting
        Rectangle r2 = (Rectangle) s1;
        r2.drawRect();
        
        
        r.getArea();
        // run time binding
        s.render(); 
        r.render();
    }
}
