package com.policyexpert.test;

//todo: extract interface for different date formats
//todo: create a parameter transform?
public class DateFromString {

    private final String[] dateParts;

    public String getDay(){
        return dateParts[0];
    }
    public String getMonth(){
        return dateParts[1];
    }
    public String getYear(){
        return dateParts[2];
    }

    public DateFromString(String dob) {
        dateParts = dob.split(" ");
    }
}
