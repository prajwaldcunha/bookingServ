package com.paypal.bfs.test.bookingserv;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingServApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(BookingServApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Thread.currentThread().join();
    }
}
