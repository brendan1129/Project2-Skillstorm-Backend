package com.skillstorm.group8.taxprep.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "formW2s")
public class FormW2 {

    /* ATTRIBUTES */
    
    // Employer's Employer Identification Number (EIN)
    @Id
    private String employerEIN;

    // Reference to the user who filled the form
    private String email;

    // Amount earned
    private double amountEarned;

    // Amount withheld from income
    private double amountWithheld;

    // employer's name
    private String employerName;

    // employer's address
    private Address address;

    /* CONSTRUCTORS */

    

    // constructor without address
    public FormW2(String employerEIN, String email, double amountEarned, double amountWithheld, String employerName) {
        this.employerEIN = employerEIN;
        this.email = email;
        this.amountEarned = amountEarned;
        this.amountWithheld = amountWithheld;
        this.employerName = employerName;
    }

    public FormW2() {
    }

    // full constructor
    public FormW2(String employerEIN, String email, double amountEarned, double amountWithheld, String employerName,
            Address address) {
        this.employerEIN = employerEIN;
        this.email = email;
        this.amountEarned = amountEarned;
        this.amountWithheld = amountWithheld;
        this.employerName = employerName;
        this.address = address;
    }

    /* GETTERS AND SETTERS */
    
    public String getEmployerEIN() {
        return employerEIN;
    }

    public void setEmployerEIN(String employerEIN) {
        this.employerEIN = employerEIN;
    }

    public double getAmountWithheld() {
        return amountWithheld;
    }

    public void setAmountWithheld(double amountWithheld) {
        this.amountWithheld = amountWithheld;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmountEarned() {
        return amountEarned;
    }

    public void setAmountEarned(double amountEarned) {
        this.amountEarned = amountEarned;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /* HASHCODE AND EQUALS */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((employerEIN == null) ? 0 : employerEIN.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        long temp;
        temp = Double.doubleToLongBits(amountEarned);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(amountWithheld);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((employerName == null) ? 0 : employerName.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FormW2 other = (FormW2) obj;
        if (employerEIN == null) {
            if (other.employerEIN != null)
                return false;
        } else if (!employerEIN.equals(other.employerEIN))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (Double.doubleToLongBits(amountEarned) != Double.doubleToLongBits(other.amountEarned))
            return false;
        if (Double.doubleToLongBits(amountWithheld) != Double.doubleToLongBits(other.amountWithheld))
            return false;
        if (employerName == null) {
            if (other.employerName != null)
                return false;
        } else if (!employerName.equals(other.employerName))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        return true;
    }

    /* TO STRING */

    @Override
    public String toString() {
        return "FormW2 [employerEIN=" + employerEIN + ", email=" + email + ", amountEarned=" + amountEarned
                + ", amountWithheld=" + amountWithheld + ", employerName=" + employerName + ", address=" + address
                + "]";
    }

    

}