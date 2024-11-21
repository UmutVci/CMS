package com.backend.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "reservations")
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="session_id", referencedColumnName = "id")
    private SessionEntity session;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id", referencedColumnName = "id")
    private CustomerEntity customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="seat_id", referencedColumnName = "id")
    private SeatEntity seat;





}