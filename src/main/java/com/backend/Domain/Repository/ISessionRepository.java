package com.backend.Domain.Repository;
import com.backend.Application.Services.Models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ISessionRepository extends JpaRepository<Session, Long> {

}
