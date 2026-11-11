import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        employee.setEmployeeId(id);
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        employee.setName(name);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        employee.setBasicSalary(basicSalary);

        System.out.print("Enter Performance Rating (1-5): ");
        int rating = scanner.nextInt();
        employee.setPerformanceRating(rating);

        employee.displayEmployeeDetails();

        scanner.close();
    }
}

