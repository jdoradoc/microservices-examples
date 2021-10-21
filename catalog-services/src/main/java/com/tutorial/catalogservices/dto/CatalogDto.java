package com.tutorial.catalogservices.dto;

import lombok.Data;

import java.util.List;

@Data
public class CatalogDto {

    private List<CategoryDto> categories;
    private List<GameDto> games;

}
