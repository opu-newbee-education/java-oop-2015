package org.opu_newbee_education.java_oop_2015.lab8.policlinic;

/**
 * Created by humanoid on 11/24/2015.
 */
abstract class MedicalInsurancePolicy {
    protected int number;
    protected String companyName;


    public MedicalInsurancePolicy() {
        this.number = 0;
        this.companyName = null;
    }

    public MedicalInsurancePolicy(int number, String companyName) {
        this.number = number;
        this.companyName = companyName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
