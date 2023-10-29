package com.example.BlogAppTest.service.impl;

import com.example.BlogAppTest.coverter.CategoryConverter;
import com.example.BlogAppTest.domain.request.CategoryRequest;
import com.example.BlogAppTest.domain.response.Category;
import com.example.BlogAppTest.domain.response.CategoryResponse;
import com.example.BlogAppTest.repository.CategoryRepository;
import com.example.BlogAppTest.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public CategoryResponse create(CategoryRequest categoryRequest) {
        return CategoryConverter.toResponse(categoryRepository.create(CategoryConverter.toCategory(categoryRequest)));
    }

    @Override
    public CategoryResponse findById(int id) {
        return CategoryConverter.toResponse(categoryRepository.getById(id));
    }

    @Override
    public CategoryResponse delete(int id) {
        return CategoryConverter.toResponse(categoryRepository.delete(id));
    }

    @Override
    public CategoryResponse update(int id, CategoryRequest categoryRequest) {
        return CategoryConverter.toResponse(categoryRepository.update(id,CategoryConverter.toCategory(categoryRequest)));
    }
}
