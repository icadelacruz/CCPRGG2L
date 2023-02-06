
package OOP;

public class Animal {
    // Attributes
    String name;
    String color;
    
    // Default Constructor of Java
    // Override this constructor
    public Animal(){
        this.name = "Tiger";
        this.color = "Orange";
//        System.out.println("Creation of object happened in animal class");
    }
    
    // Overload constructor
    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }
    
    public Animal(String color){
        this.name = "Unknown";
        this.color = color;
    }
    
    // Method
    public void eat(){
        System.out.println("Eating ...");
    }
    
    public void makeSound(){
        System.out.println("zzZZZzzz");
    }
    
    // Getters and setters 
    // Getters - used to retrieve values
    
    public String getName(){
        return this.name;
    }
    
    public String getColor(){
        return this.color;
    }
    
    // Setters - used to update/change values of variables
    public void setName(String name){
        this.name = name;
    }
    
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Animal("Lion","Red");
        System.out.println(a.getName());
        System.out.println(b.getName());
        a.setName("Horse");
        System.out.println(a.getName());
    }
}
