package com.tutorial.categoriesservices.service.impl;

import com.tutorial.categoriesservices.dto.CategoryDto;
import com.tutorial.categoriesservices.service.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Override
    public List<CategoryDto> fetch() {
        return mockCategories();
    }

    private List<CategoryDto> mockCategories() {
        List<CategoryDto> categories = new ArrayList<>();

        CategoryDto category1 = new CategoryDto();
        category1.setName("Category 1");
        categories.add(category1);

        CategoryDto category2 = new CategoryDto();
        category2.setName("Category 2");
        categories.add(category2);

        CategoryDto category3 = new CategoryDto();
        category3.setName("Category 3");
        categories.add(category3);

        return categories;

    }

}
