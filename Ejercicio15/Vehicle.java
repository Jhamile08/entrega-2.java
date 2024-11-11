package Ejercicio15;

public class Vehicle {
    private String brand;
    private String model;
    private int mileage;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, int mileage) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Ejercicio3 [brand=" + brand + ", model=" + model + ", mileage=" + mileage
                + "]";
    }

}
