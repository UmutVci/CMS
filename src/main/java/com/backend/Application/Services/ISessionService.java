package com.backend.Application.Services;
import com.backend.Adapters.dto.SessionDto;

import java.util.List;

public interface ISessionService {
SessionDto createSession(SessionDto sessionDto);
SessionDto getSession(long sessionId);
SessionDto updateSession(long sessionId,SessionDto sessionDto);
List<SessionDto>getAllSession();
    void deleteSession(long sessionId);

}
