package com.tutorial.categoriesservices.controller;

import com.tutorial.categoriesservices.dto.CategoryDto;
import com.tutorial.categoriesservices.service.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("categories")
public class CategoryController {

    ICategoryService categoryService;

    public CategoryController(final ICategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping
    @ResponseBody
    public List<CategoryDto> fetch() {
        return categoryService.fetch();
    }

}