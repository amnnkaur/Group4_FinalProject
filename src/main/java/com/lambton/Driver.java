package com.lambton;

import java.util.Date;

public class Driver extends Person {
    long licenceNumber;
    boolean isDrivingHistoryCleared;
    Double salary;

    public Driver(int id, String firstName, String lastName, Gender gender, Date birthDate, String mobileNumber, String emailId, String userName, String password) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
    }
}
