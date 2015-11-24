package org.opu_newbee_education.java_oop_2015.lab8.policlinic2;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by humanoid on 11/24/2015.
 */
public class Bill {
    protected Date date;
    protected BigDecimal withdrawAmount;
    protected MedicalServiceType serviceType;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public MedicalServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(MedicalServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
