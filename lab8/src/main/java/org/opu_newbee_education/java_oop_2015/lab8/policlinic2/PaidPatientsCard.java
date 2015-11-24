package org.opu_newbee_education.java_oop_2015.lab8.policlinic2;

import java.math.BigDecimal;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Created by humanoid on 11/24/2015.
 */
public class PaidPatientsCard implements PatientCard {
    protected String name;
    protected String surname;
    protected String address;
    protected List<Bill> bills = new ArrayList<>();
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

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public BigDecimal getTotalPaid() {
        return bills.stream().map(Bill::getWithdrawAmount).reduce(BigDecimal.ONE, (acc, val) -> acc.add(val));
    }

    public List<Bill> getBillsByDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return bills.stream()
                .filter(bill -> TimeUnit.DAYS.convert(bill.getDate().getTime() - date.getTime(), TimeUnit.MILLISECONDS) <= 1)
                .collect(Collectors.toList());
    }

    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public void removeBill(Date date, BigDecimal amount) {
        bills.removeIf(bill -> bill.getDate().equals(date) && bill.getWithdrawAmount() == amount);
    }

    public PaidPatientsCard() {
        bills = new ArrayList<>();
    }

    public PaidPatientsCard(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public PaidPatientsCard(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public PaidPatientsCard(String name, String surname, String address, List<Bill> bills, MedicalInsurancePolicy policy) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.bills = bills;
        this.policy = policy;
    }
}
