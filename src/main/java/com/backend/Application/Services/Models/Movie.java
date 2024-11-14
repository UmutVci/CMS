package com.backend.Application.Services.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Movie {


    private long id;
    private String movieName;
    private int duration;
    private String genre;
    private int price;
    private int ageRestriction;
}
