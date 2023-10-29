package com.example.BlogAppTest.service;

import com.example.BlogAppTest.domain.request.CategoryRequest;
import com.example.BlogAppTest.domain.response.CategoryResponse;

public interface CategoryService {
    CategoryResponse create (CategoryRequest categoryRequest);
    CategoryResponse findById(int id);
    CategoryResponse delete(int id);
    CategoryResponse update(int id, CategoryRequest categoryRequest);




}
