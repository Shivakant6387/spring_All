package org.example.Car;

public class AllVehicle {
    AllVehicle(){}

    private Vehicle vehicle;
    AllVehicle(Vehicle vehicle){
        this.vehicle=vehicle;

    }
    public void vehicleShow(){
        vehicle.carNoise();
    }
}
