package com.backend.Domain.Entities;



import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "sessions")
public class SessionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String startTime;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private MovieEntity movie;

    @ManyToOne
    @JoinColumn(name = "hall_id", nullable = false)
    @JsonBackReference
    private HallEntity hall;

    public HallEntity getHall(){
        return hall;
    }

    public void setHall(HallEntity hall){
        this.hall = hall;
    }

    public MovieEntity getMovie(){
        return movie;
    }
    public void setMovie(MovieEntity movie){
        this.movie = movie;
    }
    public String getStartTime(){
        return startTime;
    }
    public void setStartTime(String startTime){
        this.startTime = startTime;
    }
}
