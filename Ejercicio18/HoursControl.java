package Ejercicio18;

public class HoursControl {
    Employee employee = new Employee();
    private Double priceHour;

    public HoursControl(Double priceHour) {
        this.priceHour = priceHour;
    }

    public void weekSalary() {
        Double extra = employee.getWorkHours() - 40;
        if (employee.getWorkHours() > 40) {
            System.out.println("Your week salary is " + employee.getWorkHours() * priceHour
                    + " plus your extra hourse: " + (extra * (priceHour * 2)));
        }
    }
}
