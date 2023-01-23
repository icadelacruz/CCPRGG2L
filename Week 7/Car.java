
package OOP;

public class Car {
    String brand;
    String color;
    
    // No-args
    public Car(){
        this.brand = "Toyota";
        this.color = "White";
    }
    
    // Parameterized 
    public Car(String brand, String color){
        this.brand = brand;
        this.color = color;
    }
    
    public void running(){
        System.out.println("The engine is running ... ");
    }
}

class App1{
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Subaru", "Red");
        System.out.println(c1.brand);
        System.out.println(c2.color);
        c2.running();
        c1.running();
    }
}
