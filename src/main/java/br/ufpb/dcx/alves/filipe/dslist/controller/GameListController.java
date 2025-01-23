package br.ufpb.dcx.alves.filipe.dslist.controller;


import br.ufpb.dcx.alves.filipe.dslist.DTO.GameDTO;
import br.ufpb.dcx.alves.filipe.dslist.DTO.GameListDTO;
import br.ufpb.dcx.alves.filipe.dslist.DTO.GameMaxDTO;
import br.ufpb.dcx.alves.filipe.dslist.DTO.MovimentDTO;
import br.ufpb.dcx.alves.filipe.dslist.services.GameListService;
import br.ufpb.dcx.alves.filipe.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameDTO> findByList(@PathVariable Long listId) {
        List<GameDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody MovimentDTO body) {
        gameListService.move(listId,body.getSourceIndex(),body.getDestinationIndex());
    }

}
