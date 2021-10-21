package com.tutorial.catalogservices.controller;

import com.tutorial.catalogservices.dto.CatalogDto;
import com.tutorial.catalogservices.service.ICatalogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("catalog")
public class CatalogController {

    private final ICatalogService catalogService;

    public CatalogController(final ICatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping
    @ResponseBody
    public CatalogDto getCatalog() {
        return catalogService.getCatalog();
    }
}
