package com.devluke.dslist.services;

import com.devluke.dslist.dto.GameDTO;
import com.devluke.dslist.dto.GameListDTO;
import com.devluke.dslist.dto.GameMinimalDTO;
import com.devluke.dslist.entities.Game;
import com.devluke.dslist.repositories.GameListRepository;
import com.devluke.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        return gameListRepository.findAll()
                .stream()
                .map(x -> new GameListDTO(x))
                .toList();
    }
}
