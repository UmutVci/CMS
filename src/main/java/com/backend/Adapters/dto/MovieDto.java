package com.backend.Adapters.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
    private long id;
    private String movieName;
    private int duration;
    private String genre;
    private int price;
    private int ageRestriction;
}
