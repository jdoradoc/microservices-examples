package com.tutorial.catalogservices.service.client.impl;

import com.tutorial.catalogservices.dto.GameDto;
import com.tutorial.catalogservices.service.client.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GameService implements IGameService {

    private final static String GAMES_SERVICE_URL = "http://games-services/games";

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<GameDto> fetch() {
        return this.restTemplate.getForObject(GAMES_SERVICE_URL, List.class);
    }
}
