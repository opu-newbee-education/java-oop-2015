package org.opu_newbee_education.java_oop_2015.lab8.policlinic2;

/**
 * Created by humanoid on 11/24/2015.
 */
public class SocialPatientCard implements PatientCard {
    protected String name = "";
    protected String surname = "";
    protected String address = "";
    protected MedicalInsurancePolicy policy;


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

    public MedicalInsurancePolicy getPolicy() {
        return policy;
    }

    public void setPolicy(MedicalInsurancePolicy policy) {
        this.policy = policy;
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

    public SocialPatientCard(String name, String surname, String address, MedicalInsurancePolicy policy) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.policy = policy;
    }
}
