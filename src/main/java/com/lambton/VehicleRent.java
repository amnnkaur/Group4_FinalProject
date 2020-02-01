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

    public static void main(String[] args) {
 vehicle.put("InD","INDIA");
        for(Map.Entry<String,String>entry:vehicle.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
