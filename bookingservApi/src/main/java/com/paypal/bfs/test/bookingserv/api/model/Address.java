package com.paypal.bfs.test.bookingserv.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Embeddable
public class Address implements Serializable{

    @NotBlank(message = "Address Line 1 must not be empty!")
    @Column(nullable = false)
    private String line1;

    @Column(nullable = true)
    private String line2;

    @Column(nullable = false)
    @NotBlank(message = "City must not be empty!")
    private String city;

    @Column(nullable = false)
    @NotBlank(message = "State must not be empty!")
    private String state;

    @Column(nullable = false)
    @NotBlank(message = "Zip Code must not be empty!")
    private String zip_code;

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }
}
