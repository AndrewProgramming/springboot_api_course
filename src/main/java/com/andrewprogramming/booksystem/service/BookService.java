package com.andrewprogramming.booksystem.service;

import com.andrewprogramming.booksystem.jpa.BookRepository;
import com.andrewprogramming.booksystem.model.Book;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  @Autowired
  private BookRepository bookRepository;

  public List<Book> getAllBooks() {
    return bookRepository.findAll();
  }

  public void addBook(Book book) {
    bookRepository.save(book);
  }

  public Book findByName(String name) {
    return bookRepository.findByName(name);
  }

  @Transactional
  public void deleteBook(String name) {
    bookRepository.deleteByName(name);
  }

}
