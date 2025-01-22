package br.ufpb.dcx.alves.filipe.dslist.DTO;

import br.ufpb.dcx.alves.filipe.dslist.entites.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {}

    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
