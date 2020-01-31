package com.lambton;

import java.util.Date;

public class Customer extends Person
{
    public String prefixPlacing() {
        String str = new String(String.valueOf(prefix.CUS) + "_");
        str = str.concat(String.valueOf(personId));
        return str;
    }

    @Override
    public void setData(int personId,
                        String firstName,
                        String lastName,
                        Date birthDate,
                        Gender gender,
                        String email,
                        String address,
                        String contactNumber) {
        super.setData(personId, firstName, lastName, birthDate, gender, email, address, contactNumber);
    }

    @Override
    public void finalExecution() {

    }
}
