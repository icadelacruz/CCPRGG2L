
package OOP;

public class Student{
    
    /*
        Class: Student
        Attribute/s: name, department, ID
        Methods: getters and setters
    */
    
    String name;
    String dept;
    String ID;
    
    public Student(String name, String dept, String ID){
        this.name = name;
        this.dept = dept;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    

      
}