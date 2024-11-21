package com.backend.domain.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@Table(name = "seats")
public class SeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private int seatRow;

    @Column(nullable = false)
    private int seatColumn;

    @Column(nullable = false)
    private boolean isBooked;

    @ManyToOne
    @JoinColumn(name = "hall_id", nullable = false)
    private HallEntity hall;

    private String seatType;


    public SeatEntity(int row, int column, boolean isBooked, HallEntity hall) {
        this.seatRow = row;
        this.seatColumn = column;
        this.isBooked = isBooked;
        this.hall = hall;
    }
}
