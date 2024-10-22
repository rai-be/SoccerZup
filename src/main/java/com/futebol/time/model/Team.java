package com.futebol.time.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

    @Getter
    @Setter
    @Entity
    @Table(name = "times")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "O nome do time não pode ser vazio")
    private String name;

    @ElementCollection
    @Size(max = 5, message = "Um time pode ter no máximo 5 jogadores.")
    @NotEmpty(message = "A lista de jogadores não pode estar vazia")
    @JsonProperty("players")
    private List<String> players = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPlayers() {
        return players;
    }

    public void setPlayers(List<String> players) {
        this.players = players;
    }
}
