package com.lambton;

import java.util.Date;

public class Owner extends Person {
    String companyTitle;
    String officeNumber;
    String website;
    String[] vehicleListOwned;

    public Owner(int id, String firstName, String lastName, Gender gender, Date birthDate, String mobileNumber, String emailId, String userName, String password) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
    }
}
