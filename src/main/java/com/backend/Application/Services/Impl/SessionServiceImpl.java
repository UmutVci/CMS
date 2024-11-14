package com.backend.Application.Services.Impl;

import com.backend.Adapters.dto.SessionDto;
import com.backend.Adapters.mapper.SessionMapper;
import com.backend.Application.Services.ISessionService;
import com.backend.Application.Services.Models.Session;
import com.backend.Domain.Repository.ISessionRepository;
import com.backend.exceptions.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@AllArgsConstructor
@Service
public class SessionServiceImpl implements ISessionService {

private ISessionRepository sessionRepository;
    @Override
    public SessionDto createSession(SessionDto sessionDto) {
     Session session = SessionMapper.mapToSession(sessionDto);
     Session savedSession = sessionRepository.save(session);
return SessionMapper.mapToSessionDto(savedSession);
    }

    @Override
    public SessionDto getSession(long sessionId) {
        Session session= sessionRepository.findById(sessionId).orElseThrow( ()->
new ResourceNotFoundException("Session with id"+sessionId+" not found")
        );
        return SessionMapper.mapToSessionDto(session);
    }

    @Override
    public SessionDto updateSession(long sessionId, SessionDto updatedSessionDto) {
Session session = sessionRepository.findById(sessionId).orElseThrow(()->
        new ResourceNotFoundException("Session with id"+sessionId+" not found")
) ;
      session.setMovie(updatedSessionDto.getMovie());
session.setStartTime(updatedSessionDto.getStartTime());
session.setEndTime(updatedSessionDto.getEndTime());
Session savedSession = sessionRepository.save(session);
return SessionMapper.mapToSessionDto(savedSession);

    }

    @Override
    public List<SessionDto> getAllSession() {
        List<Session>sessions=sessionRepository.findAll();
        return sessions.stream().map(
                (session) -> SessionMapper.mapToSessionDto(session)).collect(Collectors.toList())
        ;
    }


    @Override
    public void deleteSession(long sessionId) {
        Session session=sessionRepository.findById(sessionId).orElseThrow(()->
                new ResourceNotFoundException("Session with id"+sessionId+" not found")
                );
        sessionRepository.delete(session);

    }
}
