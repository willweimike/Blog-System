package com.willweimike.blog.services;

import com.willweimike.blog.domain.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> listCategories();
}
