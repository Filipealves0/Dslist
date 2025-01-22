package br.ufpb.dcx.alves.filipe.dslist.controller;


import br.ufpb.dcx.alves.filipe.dslist.DTO.GameDTO;
import br.ufpb.dcx.alves.filipe.dslist.DTO.GameListDTO;
import br.ufpb.dcx.alves.filipe.dslist.DTO.GameMaxDTO;
import br.ufpb.dcx.alves.filipe.dslist.services.GameListService;
import br.ufpb.dcx.alves.filipe.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}
