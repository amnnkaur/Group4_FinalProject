package com.lambton;

public class Customer extends Person
{
    public String prefixPlacing() {
        String str = new String(String.valueOf(prefix.CUS) + "_");
        str = str.concat(String.valueOf(personId));
        return str;
    }

    @Override
    public void finalExecution() {

    }
}
