package com.lambton;

import java.util.Date;

public class Owner extends Person {
    String companyTitle;
    String officeNumber;
    String website;
    String[] vehicleListOwned;

    public Owner(int id, String firstName, String lastName, Gender gender, Date birthDate,
                 String mobileNumber, String emailId, String userName, String password,
                 String companyTitle, String officeNumber, String website) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.companyTitle = companyTitle;
        this.officeNumber = officeNumber;
        this.website = website;
    }
    public String[] getVehicleListOwned() {
        int i = 0;
        for (i = 0; i < vehicleListOwned.length; i++) {
            System.out.println("Vehicle " + (i + 1) + ": " + vehicleListOwned[i]);
        }
        return vehicleListOwned;
    }
}
