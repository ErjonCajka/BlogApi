package com.example.BlogAppTest.controller;

import com.example.BlogAppTest.domain.request.CategoryRequest;
import com.example.BlogAppTest.domain.response.CategoryResponse;
import com.example.BlogAppTest.service.CategoryService;
import org.springframework.web.bind.annotation.RestController;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryResponse> save(@RequestBody CategoryRequest categoryRequest){
        return ResponseEntity.ok(categoryService.create(categoryRequest));
    }

    @GetMapping
    public ResponseEntity<CategoryResponse> findById(@RequestParam int id){
        return new ResponseEntity<>(categoryService.findById(id), HttpStatus.OK);
    }
}
