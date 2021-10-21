package com.tutorial.catalogservices.service.impl;

import com.tutorial.catalogservices.dto.CatalogDto;
import com.tutorial.catalogservices.dto.CategoryDto;
import com.tutorial.catalogservices.dto.GameDto;
import com.tutorial.catalogservices.service.ICatalogService;
import com.tutorial.catalogservices.service.client.ICategoryService;
import com.tutorial.catalogservices.service.client.IGameService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService implements ICatalogService {


    private final IGameService gameService;

    private final ICategoryService categoryService;

    public CatalogService(final IGameService gameService,
                          final ICategoryService categoryService) {
        this.gameService = gameService;
        this.categoryService = categoryService;
    }

    @Override
    public CatalogDto getCatalog() {

        List<CategoryDto> categories = this.categoryService.fetch();
        List<GameDto> games = this.gameService.fetch();

        CatalogDto catalog = new CatalogDto();
        catalog.setCategories(categories);
        catalog.setGames(games);

        return catalog;
    }
}
