package org.opu_newbee_education.java_oop_2015.lab8.policlinic;

/**
 * Created by humanoid on 11/24/2015.
 */
public class VoluntaryMedicalInsurancePolicy extends MedicalInsurancePolicy {
    protected double insuranceQuote;
    protected double insurancePaid;

    public double getInsuranceQuote() {
        return insuranceQuote;
    }

    public void setInsuranceQuote(double insuranceQuote) {
        this.insuranceQuote = insuranceQuote;
    }

    public double getInsurancePaid() {
        return insurancePaid;
    }

    public void setInsurancePaid(double insurancePaid) {
        this.insurancePaid = insurancePaid;
    }

    public VoluntaryMedicalInsurancePolicy() {
        insuranceQuote = 100000.0;
        insurancePaid = 0.0;
    }

    public VoluntaryMedicalInsurancePolicy(double insuranceQuote) {
        this.insuranceQuote = insuranceQuote;
        insurancePaid = 0.0;
    }
}
