package com.willweimike.blog.controllers;

import com.willweimike.blog.domain.dtos.CategoryDto;
import com.willweimike.blog.domain.entities.Category;
import com.willweimike.blog.mapper.CategoryMapper;
import com.willweimike.blog.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/vi/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    @GetMapping
    public ResponseEntity<List<CategoryDto>> listCategories() {
        List<CategoryDto> categories = categoryService
                .listCategories()
                .stream()
                .map(categoryMapper::toDto)
                .toList();
        
        return ResponseEntity.ok(categories);
    }
}
