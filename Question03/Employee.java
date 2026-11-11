public class Employee {
    // Private attributes for encapsulation
    private int employeeId;
    private String name;
    private double basicSalary;
    private int performanceRating;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(int employeeId, String name, double basicSalary, int performanceRating) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
        setPerformanceRating(performanceRating);
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary >= 0) {
            this.basicSalary = basicSalary;
        } else {
            System.out.println("Basic salary cannot be negative.");
        }
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        if (performanceRating >= 1 && performanceRating <= 5) {
            this.performanceRating = performanceRating;
        } else {
            System.out.println("Invalid rating! Performance rating must be between 1 and 5.");
        }
    }

    // calculateBonus method based on performance rating policy
    public double calculateBonus() {
        switch (this.performanceRating) {
            case 5:
                return this.basicSalary * 0.20;
            case 4:
                return this.basicSalary * 0.15;
            case 3:
                return this.basicSalary * 0.10;
            case 2:
                return this.basicSalary * 0.05;
            case 1:
            default:
                return 0.0;
        }
    }

    // calculateTotalSalary method: Total Salary = Basic Salary + Bonus
    public double calculateTotalSalary() {
        return this.basicSalary + calculateBonus();
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Name: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Performance Rating: " + this.performanceRating);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

