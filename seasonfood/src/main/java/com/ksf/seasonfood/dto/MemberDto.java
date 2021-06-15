package com.ksf.seasonfood.dto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemberDto {

    private String id;
    private String password;
    private String name;
    private String birth;
    private String email;
    
}
