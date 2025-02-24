package br.ufpb.dcx.alves.filipe.dslist.controller;


import br.ufpb.dcx.alves.filipe.dslist.DTO.GameDTO;
import br.ufpb.dcx.alves.filipe.dslist.DTO.GameMaxDTO;
import br.ufpb.dcx.alves.filipe.dslist.entites.Game;
import br.ufpb.dcx.alves.filipe.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameDTO> findAll() {
        List<GameDTO> result = gameService.findAll();
        return result;
    }
    @GetMapping(value = "/{id}")
    public GameMaxDTO findAll(@PathVariable Long id) {
        GameMaxDTO result = gameService.findById(id);
        return result;
    }
}
