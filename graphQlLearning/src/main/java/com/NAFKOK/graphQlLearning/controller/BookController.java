package com.NAFKOK.graphQlLearning.controller;

import com.NAFKOK.graphQlLearning.model.Book;
import com.NAFKOK.graphQlLearning.repository.AuthorRepository;
import com.NAFKOK.graphQlLearning.repository.BookRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {
    
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    
    public BookController(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }
    
    @QueryMapping
    public List<Book> books() {
        return bookRepository.findAll();
    }
    
    @QueryMapping
    public Book findBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
        
    }
}
