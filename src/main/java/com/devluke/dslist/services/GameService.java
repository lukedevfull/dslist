package com.devluke.dslist.services;

import com.devluke.dslist.dto.GameMinimalDTO;
import com.devluke.dslist.entities.Game;
import com.devluke.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll(){
        var result = gameRepository.findAll();
        return result;
    }
}
