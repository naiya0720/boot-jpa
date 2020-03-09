package com.phn.bootjpa.services.impl;

import com.phn.bootjpa.repository.BookRepository;
import com.phn.bootjpa.model.Book;
import com.phn.bootjpa.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author PengHenan
 * @create  2020-03-03 0:58:40
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getBookAll() {
        return bookRepository.getBookAll();
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Optional<Book> findById(Integer id){
        return bookRepository.findById(id);
    }

    @Override
    public void deletById(Integer bid) {
        bookRepository.deleteById(bid);
    }


}
