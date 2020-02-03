package com.lambton;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

enum VehicleType {
    CAR,
    MOTORCYCLE,
    BUS
}

public class VehicleRent {
    LocalDate rentStartDate;
    LocalDate rentEndDate;
    long rentedDays;
    String vehicleId;
    String vehicleName;
    VehicleType vehicleType;
    float noOfKmDrived;
    float totalFare;
    int customerId;
    String customerName;

    public VehicleRent(int customerId, LocalDate rentStartDate, LocalDate rentEndDate, VehicleType vehicleType, String vehicleId, float noOfKmDrived) {
        this.customerId = customerId;
        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.vehicleType = vehicleType;
        this.vehicleId = vehicleId;
        this.noOfKmDrived = noOfKmDrived;

    }

    public String getVehicleName() {
        if (Vehicle.vehicleList.containsKey(vehicleId)) {
            vehicleName = Vehicle.vehicleList.get(String.valueOf(vehicleId));
        } else {
            vehicleName = "Invalid Vehicle Entry";
        }
        return vehicleName;
    }

    public String getCustomerName() {
        if (Customer.customerList.containsKey(String.valueOf(customerId))) {
            customerName = Customer.customerList.get(String.valueOf(customerId));
        } else {
            customerName = "Invalid Entry";
        }
        return customerName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
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

        switch (vehicleType) {
            case CAR: {
                totalFare = 100 * getRentedDays() + (getNoOfKmDrived() * 5);
                break;
            }
            case MOTORCYCLE: {
                totalFare = 50 * getRentedDays() + (getNoOfKmDrived() * 1);
                break;
            }
            case BUS: {
                totalFare = 250 * getRentedDays() + (getNoOfKmDrived() * 7);
                break;
            }
            default:
                totalFare = 0;
                break;
        }
        return totalFare;
    }

    public void printData() {
        System.out.println("Rent Start Date: " + getRentStartDate());
        System.out.println("Rent End Date: " + getRentEndDate());
        System.out.println("Rented No. of days: " + getRentedDays());
        System.out.println("Vehicle: " + getVehicleName());
        System.out.println("Vehicle Type: " + getVehicleType());
        System.out.println("No. of Km. drived: " + getNoOfKmDrived() + "km");
        System.out.println("Total bill to pay: $" + getTotalFare());
    }
}

