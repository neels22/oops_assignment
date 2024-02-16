package assignement;
class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public void calculateSalary() {
        // Default implementation, to be overridden by subclasses
    }
}

class FullTimeEmployee extends Employee {
    private double salary;
    private String benefits;

    public FullTimeEmployee(String name, int id, double salary, String benefits) {
        super(name, id);
        this.salary = salary;
        this.benefits = benefits;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: " + salary);
        System.out.println("Benefits: " + benefits);
    }

    @Override
    public void calculateSalary() {
        // Salary calculation logic for full-time employee
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
    }

    @Override
    public void calculateSalary() {
        // Salary calculation logic for part-time employee
    }
}

public class new3 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 1234, 5000.0, "Health insurance");
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 5678, 15.0, 20);

        System.out.println("Full-Time Employee Details:");
        fullTimeEmployee.displayDetails();
        fullTimeEmployee.calculateSalary(); 
        System.out.println("\nPart-Time Employee Details:");
        partTimeEmployee.displayDetails();
        partTimeEmployee.calculateSalary(); 
    }
}
