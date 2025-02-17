package com.example.bookings.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "bookings")
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;
    
    @ManyToOne
    @JoinColumn(name = "show_id", nullable = false)
    private Show show;
    
    @ManyToOne
    @JoinColumn(name = "seat_id", nullable = false)
    private Seat seat;
    
    @Column(nullable = false)
    private LocalDateTime bookingTime;
    
    @Enumerated(EnumType.STRING)
    private BookingStatus status;
    
    private Double amount;
}
