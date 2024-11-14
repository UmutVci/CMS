package com.backend.Application.Services;
import com.backend.Adapters.dto.SessionDto;
import com.backend.Application.Services.Models.Session;
import com.backend.Application.Services.Models.Session;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;

import java.util.List;

public interface ISessionService {
SessionDto createSession(SessionDto sessionDto);
SessionDto getSession(long sessionId);
SessionDto updateSession(long sessionId,SessionDto sessionDto);
List<SessionDto>getAllSession(long sessionId);
    void deleteSession(long sessionId);

}
