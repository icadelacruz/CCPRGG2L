
package OOP;

import java.util.ArrayList;

/* 
    Class: University
    Attribute/s: name, students
    Method/s: addStudent(), getStudents()

    Additional class: Runner class
*/

// AGGREGATION

public class University {
    String name;
    ArrayList <Student> students;
    
    public University(String name){
        this.name = name;
        students = new ArrayList<>();
    }
    
    public void addStudent(Student student){
        students.add(student);
    }
    
    public ArrayList<Student> getStudents(){
        return students;
    }
    
    public static void main(String[] args) {
        Student s1 = new Student("Leo","CCIT","2021-100432");
        Student s2 = new Student("Clara","COE","2020-101731");
        Student s3 = new Student("Marie","CBA","2021-102877");
        University NU = new University("National University");
        NU.addStudent(s1);
        NU.addStudent(s2);
        NU.addStudent(s3);
        
        for(Student s: NU.getStudents()){
            System.out.println(s.getName());
            System.out.println(s.getID());
            System.out.println(s.getDept());
            System.out.println("-----------");
        }
    }
}

