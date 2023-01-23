
package OOP;

public class App {
    public static void main(String[] args) {
        //Object instantiation - creation of object
        Dog d1 = new Dog("Husky",2,"Brown");
        Dog d2 = new Dog("Shih Tzu",3,"Black and white");
        Dog d3 = new Dog();
        System.out.println(d1.breed);
        System.out.println(d1.age);
        System.out.println(d1.color);
        System.out.println(d2.breed);
        System.out.println(d2.age);
        System.out.println(d2.color);
        System.out.println(d3.breed);
        System.out.println(d3.age);
        System.out.println(d3.color);
        d1.bark();
        d2.bark();
        d3.bark();
        d2.sleep();
        d3.eat();
        d1.eat("Chicken");
        
    }
}
