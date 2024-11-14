package com.backend.Adapters.dto;

import com.backend.Application.Services.Models.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class SessionDto {
    private long sessionId;
    private Movie movie;
    private Date startTime;
    private Date endTime;
}
