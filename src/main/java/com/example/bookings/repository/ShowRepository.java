package com.example.bookings.repository;

import com.example.bookings.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
}