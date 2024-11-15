package com.backend.Adapters.Controllers;

import com.backend.Adapters.dto.SessionDto;
import com.backend.Application.Services.ISessionService;
import com.backend.Domain.Repository.ISessionRepository;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/seccions")


public class SessionController {
private final ISessionRepository sessionRepository;
private ISessionService sessionService;

 @PostMapping
    public ResponseEntity<SessionDto>createSession(@RequestBody SessionDto sessionDto){
      SessionDto savedSession=sessionService.createSession(sessionDto);
return new ResponseEntity<>(savedSession , HttpStatus.CREATED);
 }

 @GetMapping
    public ResponseEntity<List<SessionDto>> getSessions(){
     List<SessionDto> sessions = sessionService.getAllSession();
return ResponseEntity.ok(sessions);
 }
 @DeleteMapping("{id}")
    public ResponseEntity<String> deleteSession(@PathVariable("id") long id){
     sessionService.deleteSession(id);
     return ResponseEntity.ok("The session with id " + id + " was deleted.");
 }
 @PutMapping("{id}")
    public ResponseEntity<SessionDto> updateSession(@PathVariable("id") long id , @RequestBody SessionDto sessionDto){
SessionDto session=sessionService.updateSession(id , sessionDto);
return ResponseEntity.ok(session);
 }
 @GetMapping("{id}")
    public ResponseEntity<SessionDto> getSession(@PathVariable ("id") long id){
     SessionDto dto=sessionService.getSession(id);
    return ResponseEntity.ok(dto);

 }
}
