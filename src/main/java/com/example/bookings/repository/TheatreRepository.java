package com.example.bookings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bookings.model.Theater;

import java.util.List;

@Repository
public interface TheatreRepository extends JpaRepository<Theater, Long> {
//    List<Theater> findByCity(String city);

//    List<Theater> findByName(String name);

//    List<Theater> findByCityAndName(String city, String name);
} 