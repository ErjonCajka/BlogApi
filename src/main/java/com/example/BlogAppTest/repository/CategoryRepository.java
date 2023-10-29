package com.example.BlogAppTest.repository;

import com.example.BlogAppTest.domain.response.Category;

public interface CategoryRepository {
    Category create (Category categoryRequest);
    Category getById (int id);
    Category delete (int id);
    Category  update (int id, Category categoryRequest);
}
