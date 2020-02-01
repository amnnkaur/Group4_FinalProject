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

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

/*    public String prefixer() {
        str = new String(String.valueOf(prefixers.CAR) + "_");
        str = str.concat(String.valueOf(vehicleIdentificationNumber));
        return str;
    }*/

    @Override
    public void printData() {
        System.out.println("Vehicle Identification Number: "+ prefixer());
        super.printData();
        System.out.println("Car Type: "+ getCarType());
        System.out.println("Car Color: "+ getCarColor());
//        System.out.println("Vehicle List: "+getVehicleList());
        System.out.println();
    }
}
