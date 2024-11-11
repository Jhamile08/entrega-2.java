package Ejercicio18;

public class Main {
    public static void main(String[] args) {
        // Hardcoded employee with hours worked
        Employee employee = new Employee("John Doe", 45.0); // Assume employee has worked 45 hours
        Double hourlyRate = 20.0; // Assume hourly rate is $20.0

        // Initialize HoursControl with the hourly rate
        HoursControl hoursControl = new HoursControl(hourlyRate);

        // Set the employee work hours in HoursControl
        hoursControl.employee = employee;

        // Calculate and display the weekly salary
        hoursControl.weekSalary();
    }
}
