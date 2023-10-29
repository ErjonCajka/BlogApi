package com.example.BlogAppTest.domain.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse extends BaseDomain {
    private String emri;
    private String email;
    public UserResponse(int id, String emri, String email){
        super.setId(id);
        this.emri = emri;
        this.email = email;
    }
}
