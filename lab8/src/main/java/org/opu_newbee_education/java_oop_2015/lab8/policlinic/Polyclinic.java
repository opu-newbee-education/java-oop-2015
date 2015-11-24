package org.opu_newbee_education.java_oop_2015.lab8.policlinic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by humanoid on 11/24/2015.
 */
public class Polyclinic {
    protected String number;
    protected String address;
    protected List<PatientCard> patientCards;

    public Polyclinic(String number, String address) {
        this.number = number;
        this.address = address;
        this.patientCards = new ArrayList<PatientCard>();
    }

    public Polyclinic(String number, String address, List<PatientCard> patientCards) {
        this.number = number;
        this.address = address;
        this.patientCards = patientCards;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPatientCount() {
        return this.patientCards.size();
    }

    public PatientCard getCardByPolicyNumber(int policyNumber) {
        return patientCards.stream()
                .filter(card -> card.getPolicyNumber() == policyNumber)
                .findFirst().orElse(null);
    }

    public PatientCard[] getCardsByAddress(String address) {
        return patientCards.stream()
                .filter(card -> card.getAddress().equals(address)).toArray(PatientCard[]::new);
    }

    public void removeCard(int policyNumber) {
        patientCards.removeIf(card -> card.getPolicyNumber() == policyNumber);
    }

    public void addCard(PatientCard patientCard) {
        patientCards.add(patientCard);
    }

    public PatientCard[] getPatientCards() {
        return patientCards.stream().toArray(PatientCard[]::new);
    }

    public PatientCard[] getSortedPatientCards() {
        return patientCards.stream()
                .sorted((card1, card2) -> card1.getAddress().compareTo(card2.getAddress()))
                .toArray(PatientCard[]::new);
    }
}
