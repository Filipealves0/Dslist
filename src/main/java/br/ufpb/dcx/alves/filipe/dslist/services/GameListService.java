package br.ufpb.dcx.alves.filipe.dslist.services;

import br.ufpb.dcx.alves.filipe.dslist.DTO.GameDTO;
import br.ufpb.dcx.alves.filipe.dslist.DTO.GameListDTO;
import br.ufpb.dcx.alves.filipe.dslist.DTO.GameMaxDTO;
import br.ufpb.dcx.alves.filipe.dslist.entites.Game;
import br.ufpb.dcx.alves.filipe.dslist.entites.GameList;
import br.ufpb.dcx.alves.filipe.dslist.projections.GameMinProjection;
import br.ufpb.dcx.alves.filipe.dslist.repositories.GameListRepository;
import br.ufpb.dcx.alves.filipe.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
       List<GameList> result = gameListRepository.findAll();
       return result.stream().map(x -> new GameListDTO(x)).toList();
    }

    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex  ? sourceIndex : destinationIndex;
        int max = sourceIndex > destinationIndex ? sourceIndex : destinationIndex;

        for (int i = min; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId,list.get(i).getId(),i);
        }
        for (int i = min; i <= max; i++){

        }
    }


}
