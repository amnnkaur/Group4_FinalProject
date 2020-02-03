package com.lambton;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Customer extends Person implements IDisplay {
    String address;
    String city;
    String[] vehicleRent;
    static HashMap<String ,String>customerList=new HashMap<>();

    public Customer(int id, String firstName, String lastName, Gender gender, Date birthDate,
                    String mobileNumber, String emailId,
                    String userName, String password,
                    String address, String city) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.address = address;
        this.city = city;
        this.customerList.put(String.valueOf(id),
                firstName);
    }

    public static HashMap<String, String> getCustomerList() {
        System.out.println("Customer List: ");
        for (Map.Entry<String, String> entry : customerList.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        return null;
//        return customerList;
    }

    public void setCustomerList(HashMap<String, String> customerList) {
        this.customerList = customerList;
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



    public void display() {
        System.out.println("Id: " + prefixPlacing());
        super.display();
        System.out.println("Address: " + getAddress());
        System.out.println("City: " + getCity());
        System.out.println();

    }

}
