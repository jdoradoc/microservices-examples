package com.tutorial.catalogservices.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tutorial.catalogservices.dto.CategoryDto;
import com.tutorial.catalogservices.service.ICategoryService;
import com.tutorial.catalogservices.service.client.ICategoryClient;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    private final ICategoryClient categoryClient;

    CategoryService(final ICategoryClient categoryClient) {
        this.categoryClient = categoryClient;
    }

    @Override
    @HystrixCommand(fallbackMethod = "defaultCategories")
    public List<CategoryDto> fetch() {
        return this.categoryClient.fetch();
    }

    public List<CategoryDto> defaultCategories() {
        return Collections.emptyList();
    }
}
