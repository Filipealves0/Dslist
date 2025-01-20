package br.ufpb.dcx.alves.filipe.dslist.services;

import br.ufpb.dcx.alves.filipe.dslist.entites.Game;
import br.ufpb.dcx.alves.filipe.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll(){
       var result = gameRepository.findAll();
       return result;
    }
}
