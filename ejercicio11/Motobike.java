package ejercicio11;

public class Motobike extends Vehicle {
    private String typeHelmet;

    public Motobike() {

    }

    public Motobike(String brand, String model, int maxSpeed, String typeHelmet) {
        super(brand, model, maxSpeed);
        this.typeHelmet = typeHelmet;
    }

    @Override
    public String toString() {
        return "Motobike [typeHelmet=" + typeHelmet + ", getBrand()=" + getBrand() + ", getModel()=" + getModel()
                + ", getMaxSpeed()=" + getMaxSpeed() + ", getCurrentSpeed()=" + getCurrentSpeed() + "]";
    }

}
