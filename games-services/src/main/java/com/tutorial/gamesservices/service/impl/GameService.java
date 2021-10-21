package com.tutorial.gamesservices.service.impl;

import com.tutorial.gamesservices.dto.GameDto;
import com.tutorial.gamesservices.service.IGameService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService implements IGameService {

    @Override
    public List<GameDto> fetch() {
        return this.mockProducts();
    }

    private List<GameDto> mockProducts() {
        List<GameDto> games = new ArrayList<>();

        GameDto game1 = new GameDto();
        game1.setName("Scott Pilgrim vs. The World: The Game - Complete Edition");
        game1.setPrice(14.99);
        games.add(game1);

        GameDto game2 = new GameDto();
        game2.setName("Hitman 3");
        game2.setPrice(59.99);
        games.add(game2);

        GameDto game3 = new GameDto();
        game3.setName("Cyber Shadow");
        game3.setPrice(19.99);
        games.add(game3);

        GameDto game4 = new GameDto();
        game4.setName("Stronghold: Warlords");
        game4.setPrice(34.99);
        games.add(game4);

        GameDto game5 = new GameDto();
        game5.setName("Olija");
        game5.setPrice(14.99);
        games.add(game5);

        return games;
    }
}
