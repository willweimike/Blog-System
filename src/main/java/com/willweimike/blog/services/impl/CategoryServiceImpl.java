package com.willweimike.blog.services.impl;

import com.willweimike.blog.domain.entities.Category;
import com.willweimike.blog.repositories.CategoryRepository;
import com.willweimike.blog.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPostCount();
    }
}
