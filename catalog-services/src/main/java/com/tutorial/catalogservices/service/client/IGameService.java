package com.tutorial.catalogservices.service.client;

import com.tutorial.catalogservices.dto.GameDto;

import java.util.List;

public interface IGameService {
    List<GameDto> fetch();
}
