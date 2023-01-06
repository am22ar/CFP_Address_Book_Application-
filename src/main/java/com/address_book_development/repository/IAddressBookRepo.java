package com.address_book_development.repository;

import com.address_book_development.model.AddressBookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddressBookRepo extends JpaRepository<AddressBookModel, Integer> {

    @Query(value = "select * from address_book_model where city= :city ", nativeQuery = true)
    List<String> findByCity(String city);
}
