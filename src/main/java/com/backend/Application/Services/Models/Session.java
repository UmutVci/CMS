package com.backend.Application.Services.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Session {
    private long id;
    private Movie movie;
    private Date startTime;
    private Date endTime;
}
