package com.devluke.dslist.services;

import com.devluke.dslist.dto.GameDTO;
import com.devluke.dslist.dto.GameMinimalDTO;
import com.devluke.dslist.entities.Game;
import com.devluke.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long gameId){
        Game result = gameRepository.findById(gameId).get();
        return new GameDTO(result);
    }
    
    @Transactional(readOnly = true)
    public List<GameMinimalDTO> findAll(){

        var result = gameRepository.findAll();

        return result
                .stream()
                .map(x -> new GameMinimalDTO(x))
                .toList();
    }
}
