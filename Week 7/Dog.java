
package OOP;

public class Dog {
    // Instance variables - attributes
    // static variables only has 1 copy for ALL objects
    // final variables cannot be changed. Values are FINAL.
    
    String breed = "Bulldog";
    int age = 5;
    String color;
    
    //Constructors
//     No-args constructor
    public Dog(){
        this.breed = "Bulldog";
        this.age = 3;
        this.color = "Brown";
    }
    
    // Constructor overload
    
    // Parameterized constructor
    public Dog(String breed, int age, String color){
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    
    // Methods (Behaviours / Actions)
    public void bark(){
        System.out.println("Arf arf!");
    }
    
    //Method overload
    public void eat(){
        System.out.println("The dog is eating");
    }
    
    public void eat(String food){
        System.out.println("Eating "+food);
    }
    
    public void sleep(){
        System.out.println("The dog is sleeping ... zzZZzzz");
    }
}
