package com.backend.Domain.Entities;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "movie_details")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private long id;

    private String title;
    private String genre;
    private Integer duration;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SessionEntity> sessions = new ArrayList<>();

    public void addSession(SessionEntity session){
        sessions.add(session);
        session.setMovie(this);
    }

    public void removeSession(SessionEntity session){
        sessions.remove(session);
        session.setMovie(null);
    }


}
