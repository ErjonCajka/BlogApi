package com.example.BlogAppTest.repository.impl;

import com.example.BlogAppTest.domain.response.Category;
import com.example.BlogAppTest.repository.CategoryRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
public static List<Category> categoryList = new ArrayList<>();
public static  int ID = 1;
    @Override
    public Category create(Category categoryRequest) {
        categoryRequest.setId(ID++);
        categoryList.add(categoryRequest);
        return categoryRequest;
    }

    @Override
    public Category getById(int id) {
        return categoryList.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    @Override
    public Category delete(int id) {
        Category categ = categoryList.get(id);
        categoryList.remove(id);
        return categ;
    }

    @Override
    public Category update(int id, Category categoryRequest) {
        categoryList.set(id,categoryRequest);
        return categoryRequest;
    }
}
