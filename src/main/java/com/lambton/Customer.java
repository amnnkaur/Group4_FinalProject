package com.lambton;

import java.util.Date;

public class Customer extends Person {
    String address;
    String city;
    String[] vehicleRent;

    public Customer(int id, String firstName, String lastName, Gender gender, Date birthDate,
                    String mobileNumber, String emailId,
                    String userName, String password,
                    String address, String city) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.address = address;
        this.city = city;
    }

    public String prefixPlacing() {
        str = new String(String.valueOf(prefix.CUS) + "_");
        str = str.concat(String.valueOf(id));
        return str;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public void printData() {
        System.out.println("Id: " + prefixPlacing());
        super.printData();
        System.out.println("Address: " + getAddress());
        System.out.println("City: " + getCity());
        System.out.println();

    }

}
