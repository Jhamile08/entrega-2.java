package Ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    List<Vehicle> vehicles = new ArrayList<>();

    public void addCar(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Your vehicle was added succesfully");
    }

    public void registerMaintenance(int mileageIntervale) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMileage() >= mileageIntervale) {
                vehicle.setMileage(vehicle.getMileage() - mileageIntervale);
            }
        }
    }

    public void showAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the fleet.");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }
}
