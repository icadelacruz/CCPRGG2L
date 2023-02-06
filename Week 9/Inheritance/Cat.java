
package OOP;

public class Cat extends Animal{
    
    String breed;
    
    public Cat(){
        super();
        this.breed = "Puspin";
    }
    
    public Cat(String name, String color, String breed){
        super(name,color);
        this.breed = breed;
    }
    
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Meoowww!");
    }
    
    // Inherit data fields and methods
    public static void main(String[] args) {
        Cat cat = new Cat("Cat","White","Puspin");
        System.out.println(cat.getName());
        cat.eat();
        cat.makeSound();
    }
    
    
    
    
    // Calling constructors with required arguments from super class
    
    
    // Using "super" keyword
    
    
    // Overriding parent class methods
    

}


