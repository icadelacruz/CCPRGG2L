
package OOP;

public class Shape {
    private String color;
    
    
    // Constructor overload
    public Shape(){
        this.color = "White";
    }
    
    public Shape(String color){
        this.color = color;
    }
    
    public String getColor(){ // read-only access
        return this.color;
    }
    
    public void setColor(String color){ // write-only access
        this.color = color;
    }
    
    public void render(){
        System.out.println("Rendering shape ...");
    }
    
    public double getArea(){
        return 1.0;
    }
}
