package com.policyexpert.test.about;

import com.policyexpert.test.stringutils.DateFromString;

import java.util.Map;

@SuppressWarnings("unused") // will need setters when overriding default data
public class AboutYouData {

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDob(DateFromString dob) {
        this.dob = dob;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setOtherOccupations(String otherOccupations) {
        this.otherOccupations = otherOccupations;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private  String title;
    private  String lastname;
    private  DateFromString dob;
    private  String maritalStatus;
    private  String occupation;
    private  String otherOccupations;
    private  String phoneNumber;
    private  String email;
    private  String firstname;

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

    public AboutYouData() {
        //todo: get defaults from config!
        this.title = "Mr";
        this.firstname = "Trevor";
        this.lastname = "McTrevor";
        this.dob = new DateFromString( "10 12 1976");
        this.maritalStatus = "Married";
        this.occupation = "Journalist";
        this.otherOccupations = "No";
        this.phoneNumber = "07123456789";
        this.email = "vketipisz@qmetric.co.uk";
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
