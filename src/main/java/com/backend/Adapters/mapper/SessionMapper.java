package com.backend.Adapters.mapper;

import com.backend.Adapters.dto.SessionDto;
import com.backend.Application.Services.Models.Session;
import java.util.Date;

public class SessionMapper {
public static SessionDto mapToSessionDto(Session session) {
    return new SessionDto(
            session.getId(),
            session.getMovie(),
            session.getStartTime(),
            session.getEndTime()
    );
}

    public static Session mapToSession(SessionDto sessionDto){
        return new Session(
                sessionDto.getId(),
                sessionDto.getMovie(),
                sessionDto.getStartTime(),
                sessionDto.getEndTime()
        );
    }
}

