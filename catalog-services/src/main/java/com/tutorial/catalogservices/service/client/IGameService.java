package com.tutorial.catalogservices.service.client;

import com.tutorial.catalogservices.dto.GameDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(name = "games-service")
@RequestMapping("games")
public interface IGameService {

    @GetMapping
    @ResponseBody
    public List<GameDto> fetch();

}
