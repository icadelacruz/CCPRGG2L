
package OOP;

public class Baby {
    String name;
    int age;
    
    
    public static void main(String[] args) {
        Baby baby1 = new Baby();
        Baby baby2 = new Baby();
        
        baby1.name = "Astra";
        baby2.name = "Stelllar";
        baby1.age = 1;
        baby2.age = 2;
        
        System.out.println(baby1.name + " " + baby1.age);
        
        String baby1_name = "Astra";
        String baby2_name = "Stellar";
        String baby3_name = "Luna";
        
        int baby1_age = 1;
        int baby2_age = 2;
        int baby3_age = 1;
        
        System.out.println(baby3_name + " " + baby3_age);
    }
   
}
