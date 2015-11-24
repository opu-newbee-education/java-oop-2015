package org.opu_newbee_education.java_oop_2015.lab8.policlinic;

/**
 * Created by humanoid on 11/24/2015.
 */
public class SocialPatientCard implements PatientCard {
    protected String name;
    protected String surname;
    protected String address;
    protected int policyNumber = 0;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public SocialPatientCard(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public SocialPatientCard(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public SocialPatientCard(String name, String surname, String address, int policyNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.policyNumber = policyNumber;
    }
}
