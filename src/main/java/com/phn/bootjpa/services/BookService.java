package com.phn.bootjpa.services;

import com.phn.bootjpa.model.Book;

import java.util.List;
import java.util.Optional;

/**
 * @author PengHenan
 * @create  2020-03-03 0:59:17
 */
public interface BookService {

    List<Book> getBookAll();

    Book addBook(Book book);

    Optional<Book> findById(Integer bid);

    void deletById(Integer bid);

}
