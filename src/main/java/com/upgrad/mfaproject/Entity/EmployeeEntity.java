package com.upgrad.mfaproject.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeID;

    @Column(name = "name")
    private String employeeName;

    @Column(name = "designation")
    private String employeeDesignation;

    @Column(name = "skills")
    private String employeeSkills;

    @Column(name = "contact")
    private String employeeContact;

    @Column(name = "country")
    private String employeeCountry;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeSkills() {
        return employeeSkills;
    }

    public void setEmployeeSkills(String employeeSkills) {
        this.employeeSkills = employeeSkills;
    }

    public String getEmployeeContact() {
        return employeeContact;
    }

    public void setEmployeeContact(String employeeContact) {
        this.employeeContact = employeeContact;
    }

    public String getEmployeeCountry() {
        return employeeCountry;
    }

    public void setEmployeeCountry(String employeeCountry) {
        this.employeeCountry = employeeCountry;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeSkills='" + employeeSkills + '\'' +
                ", employeeContact=" + employeeContact +
                ", employeeCountry='" + employeeCountry + '\'' +
                '}';
    }
}
