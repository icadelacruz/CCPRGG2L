package OOP;

public class EmployeeRunner {

    public static void main(String[] args) {
        Employee e1 = new Employee("Castro", "Jem", "202013", "January 2, 2009", 45000);
        HourlyEmployee e2 = new HourlyEmployee("Rosas", "Feliz", "201221", "February 3, 2011", 500);
        ContractEmployee e3 = new ContractEmployee("Dela Fuente", "Roger", "2033333", "April 6, 2014", 200000);

            
        e1.displayRateOfPay();
        e2.displayRateOfPay();
        e3.displayRateOfPay();
    }
}
