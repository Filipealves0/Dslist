package br.ufpb.dcx.alves.filipe.dslist.services;

import br.ufpb.dcx.alves.filipe.dslist.DTO.GameDTO;
import br.ufpb.dcx.alves.filipe.dslist.DTO.GameMaxDTO;
import br.ufpb.dcx.alves.filipe.dslist.entites.Game;
import br.ufpb.dcx.alves.filipe.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public GameMaxDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameMaxDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameDTO> findAll(){
       List<Game> result = gameRepository.findAll();
       return result.stream().map(x -> new GameDTO(x)).toList();
    }
}
