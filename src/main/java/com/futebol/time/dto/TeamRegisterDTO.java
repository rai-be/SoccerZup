package com.futebol.time.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TeamRegisterDTO {
    @NotEmpty(message = "O nome do time não pode ser vazio")
    @Size(min = 3, message = "O nome deve ter pelo menos 3 caracteres")
    private String name;

    @NotEmpty(message = "A lista de jogadores não pode estar vazia")
    @Size(max = 5, message = "Um time pode ter no máximo 5 jogadores.")
    private List<String> players;

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
