package com.tutorial.catalogservices.service.client;

import com.tutorial.catalogservices.dto.CategoryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(name = "categories-service")
@RequestMapping("categories")
public interface ICategoryService {

    @GetMapping
    @ResponseBody
    List<CategoryDto> fetch();
}
