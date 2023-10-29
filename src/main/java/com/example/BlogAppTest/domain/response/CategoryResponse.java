package com.example.BlogAppTest.domain.response;

public class CategoryResponse extends BaseDomain{
    private String emri;
   public CategoryResponse(int id, String emri){
       super.setId(id);
       this.emri =emri;

   }
}
