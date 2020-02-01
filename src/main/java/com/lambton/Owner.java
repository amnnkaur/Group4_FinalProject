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

    public void setVehicleListOwned(String[] vehicleListOwned) {
        this.vehicleListOwned = vehicleListOwned;
    }

    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String prefixPlacing() {
        str = new String(String.valueOf(prefix.OWN) + "_");
        str = str.concat(String.valueOf(id));
        return str;
    }

    @Override
    public void printData() {
        System.out.println("Id: " + prefixPlacing());
        super.printData();
        System.out.println("Company Title: " + getCompanyTitle());
        System.out.println("Business Landline Number: " + getOfficeNumber());
        System.out.println("Website: " + getWebsite());
        getVehicleListOwned();
        System.out.println();
    }
}