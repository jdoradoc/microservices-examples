package com.tutorial.categoriesservices.service;

import com.tutorial.categoriesservices.dto.CategoryDto;

import java.util.List;

public interface ICategoryService {
    List<CategoryDto> fetch();
}
