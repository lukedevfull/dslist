package com.devluke.dslist.controllers;

import com.devluke.dslist.dto.GameDTO;
import com.devluke.dslist.dto.GameMinimalDTO;
import com.devluke.dslist.entities.Game;
import com.devluke.dslist.services.GameService;
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

    @GetMapping(value = "/{gameId}")
    public GameDTO findById(@PathVariable Long gameId){
        return gameService.findById(gameId);
    }

    @GetMapping(value = "/allGames")
    public List<GameMinimalDTO> findAll(){
        return gameService.findAll();
    }
}
