package com.lambton;

enum CarType {
    Hatchback,
    Sedan,
    MPV,
    SUV,
    Crossover,
    Coupe,
    Convertible
}

public class Car extends Vehicle {

    CarType carType;
    String carColor;

    public Car(long vehicleIdentificationNumber, String vehicleDescription, String manufacturerName,
               boolean isSelfDrive/*, String driver*/, boolean isInsured,/* String insuranceNameProvider,*/
               int noOfSeat, Fuel fuelType,/* Type vehicleType, int baseRate, int ratePerKm,*/
               CarType carType, String carColor) {

        super(vehicleIdentificationNumber, vehicleDescription, manufacturerName,
                isSelfDrive, /*driver,*/ isInsured, /*insuranceNameProvider,*/
                noOfSeat, fuelType/*, vehicleType, baseRate, ratePerKm*/);
        super.vehicleType=Type.Car;
        this.carType = carType;
        this.carColor = carColor;
    }
}
