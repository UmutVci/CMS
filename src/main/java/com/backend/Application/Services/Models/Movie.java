package com.backend.Application.Services.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "movieName", nullable=false)
    private String movieName;
    @Column(name = "duration")
    private int duration;
    @Column(name="genre")
    private String genre;
    @Column(name="price", nullable=false)
    private int price;
    @Column(name="ageRestriction")
    private int ageRestriction;
}
