package Ejercicio18;

public class Employee {
    private String name;
    private Double workHours;

    public Employee() {
    }

    public Employee(String name, Double workHours) {
        this.name = name;
        this.workHours = workHours;
    }

    public String getName() {
        return name;
    }

    public Double getWorkHours() {
        return workHours;
    }

}
