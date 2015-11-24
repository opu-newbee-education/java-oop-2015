package org.opu_newbee_education.java_oop_2015.lab8.policlinic2;

import java.math.BigDecimal;

/**
 * Created by humanoid on 11/24/2015.
 */
public class VoluntaryMedicalInsurancePolicy extends MedicalInsurancePolicy {
    protected BigDecimal insuranceQuote = BigDecimal.valueOf(100000.0);
    protected BigDecimal insurancePaid = BigDecimal.ZERO;

    public BigDecimal getInsuranceQuote() {
        return insuranceQuote;
    }

    public void setInsuranceQuote(BigDecimal insuranceQuote) {
        this.insuranceQuote = insuranceQuote;
    }

    public BigDecimal getInsurancePaid() {
        return insurancePaid;
    }

    public void setInsurancePaid(BigDecimal insurancePaid) {
        this.insurancePaid = insurancePaid;
    }

    public VoluntaryMedicalInsurancePolicy(int number, String companyName) {
        super(number, companyName);
    }

    public VoluntaryMedicalInsurancePolicy(int number, String companyName, BigDecimal insuranceQuote) {
        super(number, companyName);
        this.insuranceQuote = insuranceQuote;
    }

    public VoluntaryMedicalInsurancePolicy(int number, String companyName, BigDecimal insuranceQuote, BigDecimal insurancePaid) {
        super(number, companyName);
        this.insuranceQuote = insuranceQuote;
        this.insurancePaid = insurancePaid;
    }
}
