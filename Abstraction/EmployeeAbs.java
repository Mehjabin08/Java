
abstract class Employee {
    protected String name;
    protected int employeeId;

   
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    
    public abstract double calculateSalary();
    public abstract void displayInfo();
}


class Manager extends Employee {
    private double basicSalary;
    private double bonus;

    
    public Manager(String name, int employeeId, double basicSalary, double bonus) {
        super(name, employeeId);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

   
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    
    public void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Manager's Salary: " + calculateSalary());
    }
}


class Programmer extends Employee {
    private double monthlyPay;

    
    public Programmer(String name, int employeeId, double monthlyPay) {
        super(name, employeeId);
        this.monthlyPay = monthlyPay;
    }

    
    public double calculateSalary() {
        return monthlyPay;
    }

    
    public void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Programmer's Monthly Pay: " + calculateSalary());
    }
}


public class EmployeeAbs {
    public static void main(String[] args) {
        
        Manager manager = new Manager("John Doe", 1001, 5000, 2000);
        Programmer programmer = new Programmer("Alice Smith", 2001, 4000);

        
        manager.displayInfo();
        programmer.displayInfo();
    }
}
