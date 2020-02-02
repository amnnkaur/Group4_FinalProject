package com.lambton;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.time.temporal.ChronoUnit;

public class VehicleRent {
    LocalDate rentStartDate;
    LocalDate rentEndDate;
    long rentedDays;
    long vehicleId;
    String vehicleName;
    float noOfKmDrived;
    float totalFare;

    public VehicleRent(LocalDate rentStartDate, LocalDate rentEndDate, long vehicleId, float noOfKmDrived) {
        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.vehicleId = vehicleId;
        this.noOfKmDrived = noOfKmDrived;
    }

    public String getVehicleName(){
        if(Vehicle.vehicleList.containsKey(String.valueOf(vehicleId))){
//            System.out.println("if block");
            vehicleName=Vehicle.vehicleList.get(String.valueOf(vehicleId));
        }
        else{
//            System.out.println("else block");
            vehicleName="Invalid Vehicle Entry";
        }
        return vehicleName;
    }

    public LocalDate getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(LocalDate rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public LocalDate getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(LocalDate rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public long getRentedDays() {
        rentedDays = getRentStartDate().until(getRentEndDate(), ChronoUnit.DAYS);
        return rentedDays;
    }


    public float getNoOfKmDrived() {
        return noOfKmDrived;
    }

    public void setNoOfKmDrived(float noOfKmDrived) {
        this.noOfKmDrived = noOfKmDrived;
    }

    public float getTotalFare() {
        totalFare=100*getRentedDays()+(getNoOfKmDrived()*5);
        return totalFare;
    }

/*    public void setTotalFare(float totalFare) {
        this.totalFare = totalFare;
    }*/

    public void printData() {
        System.out.println("Rent Start Date: " + getRentStartDate());
        System.out.println("Rent End Date: " + getRentEndDate());
        System.out.println("Rent in No. of days: " + getRentedDays());
        System.out.println("Vehicle: "+ getVehicleName());
        System.out.println("No. of Km. drived: " + getNoOfKmDrived());
        System.out.println("Total bill to pay: " + getTotalFare());
    }
}

