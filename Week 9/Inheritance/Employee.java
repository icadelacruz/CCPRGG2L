
package OOP;

public class Employee {
    private String lastname;
    private String firstname;
    private String employeeID;
    private String dataOfHire;
    private double rateOfPay;
    
    public Employee(String lastname, String firstname, String ID, String dateOfHire, double rateOfPay){
        this.lastname = lastname;
        this.firstname = firstname;
        this.employeeID = ID;
        this.dataOfHire = dateOfHire;
        this.rateOfPay = rateOfPay;
    }
    
    public void work(){
        System.out.println("Working ...");
    }
    
    public void displayRateOfPay(){
        System.out.println("You are paid "+this.rateOfPay + " per month.");
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getDataOfHire() {
        return dataOfHire;
    }

    public void setDataOfHire(String dataOfHire) {
        this.dataOfHire = dataOfHire;
    }

    public double getRateOfPay() {
        return rateOfPay;
    }

    public void setRateOfPay(double rateOfPay) {
        this.rateOfPay = rateOfPay;
    }
    
    
}
