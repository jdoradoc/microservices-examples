package com.tutorial.catalogservices.service.client;

import com.tutorial.catalogservices.dto.CategoryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(name = "categories-service")
public interface ICategoryClient {

    @GetMapping("categories")
    @ResponseBody

    List<CategoryDto> fetch();

}
