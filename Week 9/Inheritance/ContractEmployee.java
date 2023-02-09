
package OOP;


public class ContractEmployee extends Employee{
    public ContractEmployee(String lastname, String firstname, String employeeID, String dateOfHire, double rateOfPay){
        super(lastname, firstname, employeeID, dateOfHire, rateOfPay);
    }
    
    public void displayRateOfPay(){
        System.out.println("You are paid "+this.getRateOfPay()+" per contract.");
    }
    
    @Override
    public void work(){
        super.work();
        System.out.println("Taking a break ...");
    }
}
