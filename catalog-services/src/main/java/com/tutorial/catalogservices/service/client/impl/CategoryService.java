package com.tutorial.catalogservices.service.client.impl;

import com.tutorial.catalogservices.dto.CategoryDto;
import com.tutorial.catalogservices.service.client.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    private final static String CATEGORIES_SERVICE_URL = "http://categories-service/categories";

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<CategoryDto> fetch() {
        return this.restTemplate.getForObject(CATEGORIES_SERVICE_URL, List.class);
    }
}
