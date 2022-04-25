package com.policyexpert.test;

public class DobFromString {

    private final String[] dobParts;

    public String getDobDay(){
        return dobParts[0];
    }
    public String getDobMonth(){
        return dobParts[1];
    }
    public String getDobYear(){
        return dobParts[2];
    }

    public DobFromString(String dob) {
        dobParts = dob.split(" ");
    }
}
