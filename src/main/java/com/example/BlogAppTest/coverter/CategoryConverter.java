package com.example.BlogAppTest.coverter;

import com.example.BlogAppTest.domain.request.CategoryRequest;
import com.example.BlogAppTest.domain.response.Category;
import com.example.BlogAppTest.domain.response.CategoryResponse;

public class CategoryConverter {
    public static CategoryResponse toResponse(Category category){
        return new CategoryResponse(category.getId(),category.getEmri());
    }
    public static Category toCategory(CategoryRequest categoryRequest){
        return new Category(categoryRequest.getEmri());
    }
}
