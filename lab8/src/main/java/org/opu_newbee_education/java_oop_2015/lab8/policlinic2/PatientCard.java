package org.opu_newbee_education.java_oop_2015.lab8.policlinic2;

/**
 * Created by humanoid on 11/24/2015.
 */
public interface PatientCard {
    String getName();
    void setName(String name);
    String getSurname();
    void setSurname(String surname);
    String getAddress();
    void setAddress(String address);
    MedicalInsurancePolicy getPolicy();
    void setPolicy(MedicalInsurancePolicy policy);
}
