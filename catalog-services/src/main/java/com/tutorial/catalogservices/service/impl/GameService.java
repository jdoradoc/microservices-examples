package com.tutorial.catalogservices.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tutorial.catalogservices.dto.GameDto;
import com.tutorial.catalogservices.service.IGameService;
import com.tutorial.catalogservices.service.client.IGameClient;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class GameService implements IGameService {

    private final IGameClient gamesClient;

    GameService(final IGameClient gamesClient) {
        this.gamesClient = gamesClient;
    }

    @Override
    @HystrixCommand(fallbackMethod = "defaultGames")
    public List<GameDto> fetch() {
        return gamesClient.fetch();
    }

    public List<GameDto> defaultGames() {
        return Collections.emptyList();
    }

}
