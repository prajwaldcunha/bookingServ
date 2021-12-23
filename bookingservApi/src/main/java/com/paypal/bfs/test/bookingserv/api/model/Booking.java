package com.paypal.bfs.test.bookingserv.api.model;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Booking resource
 * <p>
 * Booking resource object
 */

@Entity
@Table(name = "Booking")
public class Booking {

    /**
     * Booking id
     */
    @Id
    private Integer id;

    /**
     * First name
     */
    @Column(nullable = false)
    private String firstName;

    /**
     * Last name
     */
    @Column(nullable = false)
    private String lastName;

    /**
     * Date of Birth
     */
    @Column(nullable = false)
    private Date dateOfBirth;

    /**
     * CheckIn Date
     */
    @Column(nullable = false)
    @NotNull
    private Timestamp checkinDatetime;

    /**
     * Checkout Date
     */
    @Column(nullable = false)
    @NotNull
    private Timestamp checkoutDatetime;

    /**
     * Total Price
     */
    @Column(nullable = false)
    @NotNull
    private Integer totalprice;

    /**
     * Deposit
     */
    @Column(nullable = false)
    @NotNull
    private Integer deposit;

    @Embedded
    @Valid
    private Address address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Timestamp getCheckinDatetime() {
        return checkinDatetime;
    }

    public void setCheckinDatetime(Timestamp checkinDatetime) {
        this.checkinDatetime = checkinDatetime;
    }

    public Timestamp getCheckoutDatetime() {
        return checkoutDatetime;
    }

    public void setCheckoutDatetime(Timestamp checkoutDatetime) {
        this.checkoutDatetime = checkoutDatetime;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Booking() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return id.equals(booking.id) && firstName.equals(booking.firstName) && lastName.equals(booking.lastName) && dateOfBirth.equals(booking.dateOfBirth) && checkinDatetime.equals(booking.checkinDatetime) && checkoutDatetime.equals(booking.checkoutDatetime) && totalprice.equals(booking.totalprice) && deposit.equals(booking.deposit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, dateOfBirth, checkinDatetime, checkoutDatetime, totalprice, deposit);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", checkinDatetime=" + checkinDatetime +
                ", checkoutDatetime=" + checkoutDatetime +
                ", totalprice=" + totalprice +
                ", deposit=" + deposit +
                ", address=" + address +
                '}';
    }
}

