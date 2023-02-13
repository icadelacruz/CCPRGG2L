
package OOP;

public class Person extends Employee implements Doctor, Professor{
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

    @Override
    public void consult() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endorse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reseta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void teach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void facilitate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void report() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
