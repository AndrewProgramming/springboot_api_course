package com.andrewprogramming.booksystem.controller;

import com.andrewprogramming.booksystem.model.Book;
import com.andrewprogramming.booksystem.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "跟图书相关的Controller")
@Log4j2
@RestController
public class BookController {

  @Autowired
  private BookService bookService;

  //  @RequestMapping("/allbook")
  @GetMapping("/allbook")
  public List<Book> getAllBook() {
/*    List<Book> allBookList = new ArrayList<>();
    allBookList.add(new Book("1","Java从入门到精通","Andrew"));
    allBookList.add(new Book("2","Maven从入门到精通","Andrew"));
    return allBookList;*/

    return bookService.getAllBooks();
  }

  @ApiOperation(value = "获取全部的图书")
  @ApiResponses(value={
      @ApiResponse(code = 200,message = "请求成功"),
      @ApiResponse(code = 404,message = "么诶有找到")
  })
  //test git and github
  //  @RequestMapping(value = "/addBook",method = RequestMethod.POST)
  @PostMapping(value = "addBook")
  public void addBook(@RequestBody Book book) {
    log.info("book author {}", book.getAuthor());
    log.info("book name {}", book.getName());
    bookService.addBook(book);
  }

  @GetMapping("/findBookByBookname")
  public Book findBookByBookname(@RequestParam String name) {
    return bookService.findByName(name);
  }

  @GetMapping("/deleteBook")
  public void deleteBookByName(@RequestParam String name) {
    bookService.deleteBook(name);
  }


}
