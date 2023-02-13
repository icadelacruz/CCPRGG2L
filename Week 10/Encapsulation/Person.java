package OOP;

public class Person{
    private int age;
    
    public Person(){
        this.age = 0;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        if(age >= 0){
            // we do not allow negative values for age
            this.age = age;
        }
        else{
            System.out.println("Invalid age");
        }
    }
}
