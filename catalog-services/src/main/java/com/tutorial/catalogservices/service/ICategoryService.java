package com.tutorial.catalogservices.service;

import com.tutorial.catalogservices.dto.CategoryDto;

import java.util.List;

public interface ICategoryService {

    List<CategoryDto> fetch();

}
