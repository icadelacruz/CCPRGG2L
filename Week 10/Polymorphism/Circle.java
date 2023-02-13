
package OOP;

public class Circle extends Shape{
    double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI * this.radius;
    }
    
    public double getAreaCircle(){
        return Math.PI * this.radius;
    }
}
