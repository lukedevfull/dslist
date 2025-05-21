package com.devluke.dslist.controllers;

import com.devluke.dslist.dto.GameMinimalDTO;
import com.devluke.dslist.entities.Game;
import com.devluke.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinimalDTO> findAll(){
        var result = gameService.findAll();
        return result;
    }
}
