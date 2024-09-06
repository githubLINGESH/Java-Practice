// Person.java
class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

// Employee.java
class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String insuranceNumber;

    // Constructor
    public Employee(String name, double annualSalary, int yearStarted, String insuranceNumber) {
        super(name); // Calling the constructor of the superclass (Person)
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.insuranceNumber = insuranceNumber;
    }

    // Getter and Setter for annualSalary
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    // Getter and Setter for yearStarted
    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    // Getter and Setter for insuranceNumber
    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
}


// TestEmployee.java
public class emp {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", 50000, 2010, "AB123456C");

        // Test getters
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("Insurance Number: " + employee.getInsuranceNumber());

        // Test setters
        employee.setName("Jane Doe");
        employee.setAnnualSalary(60000);
        employee.setYearStarted(2012);
        employee.setInsuranceNumber("XY987654Z");

        // Test getters again after setting new values
        System.out.println("\nUpdated Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("Insurance Number: " + employee.getInsuranceNumber());
    }
}
