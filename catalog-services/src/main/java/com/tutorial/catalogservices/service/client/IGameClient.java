package com.tutorial.catalogservices.service.client;

import com.tutorial.catalogservices.dto.GameDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(name = "games-service")
public interface IGameClient {

    @GetMapping("games")
    @ResponseBody
    List<GameDto> fetch();

}
