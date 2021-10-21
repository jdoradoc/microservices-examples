package com.tutorial.gamesservices.service;

import com.tutorial.gamesservices.dto.GameDto;

import java.util.List;

public interface IGameService {
    List<GameDto> fetch();
}
