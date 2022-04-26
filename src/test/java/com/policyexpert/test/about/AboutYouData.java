package com.policyexpert.test.about;

import com.policyexpert.test.stringutils.DateFromString;
import io.cucumber.datatable.DataTable;

import java.util.Map;

public class AboutYouData {

    private final String title;
    private final String lastname;
    private final DateFromString dob;
    private final String maritalStatus;
    private final String occupation;
    private final String otherOccupations;
    private final String phoneNumber;
    private final String email;
    private final String firstname;

    public AboutYouData(Map<String, String> dataMap) {
        //todo: replace with conversion to/from json using object mapper
        this.title = dataMap.get("title");
        this.firstname = dataMap.get("firstname");
        this.lastname = dataMap.get("lastname");
        this.dob = new DateFromString( dataMap.get("dob"));
        this.maritalStatus = dataMap.get("maritalStatus");
        this.occupation = dataMap.get("occupation");
        this.otherOccupations = dataMap.get("otherOccupations");
        this.phoneNumber = dataMap.get("phoneNumber");
        this.email = dataMap.get("email");
    }

    public String getTitle() {
        return title;
    }

    public String getLastname() {
        return lastname;
    }

    public DateFromString getDob() {
        return dob;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getOtherOccupations() {
        return otherOccupations;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }
}
