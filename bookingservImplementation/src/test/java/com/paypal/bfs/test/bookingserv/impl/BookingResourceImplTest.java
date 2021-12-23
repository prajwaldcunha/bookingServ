package com.paypal.bfs.test.bookingserv.impl;

import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.api.repository.BookingRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class BookingResourceImplTest {

    @Mock
    BookingRepository bookingRepository;

    @InjectMocks
    BookingResourceImpl bookingResource;

    @Test
    public void testCreateBooking() {
        Booking booking = new Booking();
        booking.setId(11);

        when(bookingRepository.save(booking)).thenReturn(booking);

        ResponseEntity responseEntity = bookingResource.create(booking);
        assertThat(responseEntity.getStatusCodeValue(), is(HttpStatus.OK.value()));
    }

    @Test
    public void testFindAllBookings() {
        Booking booking1 = new Booking();
        Booking booking2 = new Booking();
        Booking booking3 = new Booking();

        when(bookingRepository.findAll()).thenReturn(Arrays.asList(booking1, booking2, booking3));

        List<Booking> bookings = bookingResource.getAllBookings();

        assertThat(bookings.size(), is(3));
    }
}
