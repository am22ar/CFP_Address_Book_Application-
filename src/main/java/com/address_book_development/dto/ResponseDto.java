package com.address_book_development.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class ResponseDto {
    public String message;
    public Object data;
    public String token;

//    public ResponseDto(String message, Object data) {
//        this.message = message;
//        this.data = data;
//    }
}
