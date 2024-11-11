package ejercicio11;

public class Car extends Vehicle {
    private String numDoors;

    public Car() {
    }

    public Car(String brand, String model, int maxSpeed, String numDoors) {
        super(brand, model, maxSpeed);
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car [numDoors=" + numDoors + ", getBrand()=" + getBrand() + ", getModel()=" + getModel()
                + ", getMaxSpeed()=" + getMaxSpeed() + ", getCurrentSpeed()=" + getCurrentSpeed() + "]";
    }

}
