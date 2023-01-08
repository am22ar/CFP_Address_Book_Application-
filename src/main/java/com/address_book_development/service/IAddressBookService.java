package com.address_book_development.service;

import com.address_book_development.dto.AddressBookDto;
import com.address_book_development.model.AddressBookModel;

import java.util.List;

public interface IAddressBookService {
    public AddressBookModel addPerson(AddressBookDto addressBookDto);
    public AddressBookModel getById(int personId);
    public AddressBookModel getByToken(String token);
    public List<AddressBookModel> getAll();
    public AddressBookModel updateById(int personId, AddressBookDto addressBookDto);
    public AddressBookModel updateByToken(int personId,String Token, AddressBookDto addressBookDto);
    public AddressBookModel deleteById(int personId);
    public List<String> findByCity(String city);
}
