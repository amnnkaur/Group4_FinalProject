package com.lambton;

public class Motorcycle extends Vehicle {

    double topSpeed;
    double milage;

    public Motorcycle(String vehicleIdentificationNumber, String vehicleDescription,
                      String manufacturerName, boolean isSelfDrive,
                      boolean isInsured, int noOfSeat, Fuel fuelType,
                      double topSpeed, double milage) {
        super(vehicleIdentificationNumber, vehicleDescription, manufacturerName,
                isSelfDrive, isInsured, noOfSeat, fuelType);
        super.vehicleType = Type.Motorcycle;
        this.topSpeed = topSpeed;
        this.milage = milage;

    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getMilage() {
        return milage;
    }

    public void setMilage(float milage) {
        this.milage = milage;
    }



    public void display() {
        super.display();
        System.out.println("Top Speed: " + getTopSpeed()+"km/hr");
        System.out.println("Mileage: " + getMilage()+" mpg");
        System.out.println();
    }
}
