package com.paypal.bfs.test.bookingserv.impl;

import com.paypal.bfs.test.bookingserv.api.BookingResource;
import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.api.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingResourceImpl implements BookingResource {

    @Autowired
    private BookingRepository bookingRepository;

    @Transactional(readOnly = false)
    @Override
    public ResponseEntity create(Booking booking) {
        try {
            boolean isBookingPresent = bookingRepository.existsById(booking.getId());
            if (isBookingPresent) {
                return ResponseEntity.status(HttpStatus.CONFLICT).body("Booking is already done");
            } else {
                Booking newBooking = bookingRepository.save(booking);
                return ResponseEntity.ok(newBooking);
            }
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
        }
    }

    @Transactional(readOnly = true)
    @Override
    public List<Booking> getAllBookings() {
        List<Booking> bookings = bookingRepository.findAll();
        return bookings;

    }

}
