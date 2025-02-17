package com.example.bookings.repository;

import com.example.bookings.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
//    List<Seat> findByTheatreId(Long theatreId);
//    List<Seat> findByShowId(Long showId);
//    List<Seat> findByShowIdAndAvailable(Long showId, boolean available);
//    List<Seat> findByTheatreIdAndSeatNumber(Long theatreId, String seatNumber);
} 