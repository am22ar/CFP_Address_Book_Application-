package com.address_book_development.service;

import com.address_book_development.dto.ResponseDto;
import com.address_book_development.model.EmailModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



public interface IEmailService {
    public ResponseEntity<ResponseDto> sendEmail(EmailModel emailModel);
}
