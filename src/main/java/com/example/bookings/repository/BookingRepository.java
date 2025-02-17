package com.example.bookings.repository;

import com.example.bookings.model.Booking;
import com.example.bookings.model.BookingStatus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByShowId(Long showId);

    List<Booking> findByUserId(Long userId);

    List<Booking> findByBookingTimeBetween(LocalDateTime start, LocalDateTime end);

    List<Booking> findByStatus(BookingStatus status);
} 