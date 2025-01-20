package br.ufpb.dcx.alves.filipe.dslist.repositories;

import br.ufpb.dcx.alves.filipe.dslist.entites.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
