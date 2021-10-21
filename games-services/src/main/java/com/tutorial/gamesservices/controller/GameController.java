package com.tutorial.gamesservices.controller;

import com.tutorial.gamesservices.dto.GameDto;
import com.tutorial.gamesservices.service.IGameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("games")
public class GameController {

    private final IGameService gameService;

    public GameController(final IGameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    @ResponseBody
    public List<GameDto> fetch() {
        return this.gameService.fetch();
    }
}
