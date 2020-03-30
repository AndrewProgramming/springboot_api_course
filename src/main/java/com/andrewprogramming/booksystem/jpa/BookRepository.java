package com.andrewprogramming.booksystem.jpa;

import com.andrewprogramming.booksystem.model.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, Long> {

  Book findByName(String name);

  void deleteByName(String name);


}
