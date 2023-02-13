
package OOP;


public class PersonDemo {
        public static void main(String[] args) {
        Person p = new Person();
        p.setAge(5); // write-only
        System.out.println(p.getAge()); //read-only 
    }
}
