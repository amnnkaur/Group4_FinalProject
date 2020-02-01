package com.lambton;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class VehicleRent {
    LocalDate rentStartDate;
    LocalDate rentEndDate;
    int rentedDays;
    static HashMap<String, String> vehicle = new HashMap<>();
    float noOfKmDrived;
    float totalFare;

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

    public int getRentedDays() {
        return rentedDays;
    }

    public void setRentedDays(int rentedDays) {
        this.rentedDays = rentedDays;
    }

    public static HashMap<String, String> getVehicle() {
        return vehicle;
    }

    public static void setVehicle(HashMap<String, String> vehicle) {
        VehicleRent.vehicle = vehicle;
    }

    public float getNoOfKmDrived() {
        return noOfKmDrived;
    }

    public void setNoOfKmDrived(float noOfKmDrived) {
        this.noOfKmDrived = noOfKmDrived;
    }

    public float getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(float totalFare) {
        this.totalFare = totalFare;
    }

 /*   public static void main(String[] args) {
 vehicle.put("IND","INDIA");
        for(Map.Entry<String,String>entry:vehicle.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }*/
    }

