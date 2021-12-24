package com.bs23.controller;

import com.bs23.dto.entity.Book;
import com.bs23.dto.response.BookResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
@RestController
public class BookController {

  List<Book> listOfBook = new ArrayList<>();

  @PostMapping("/save")
  public ResponseEntity<Object> save(@RequestBody Book book) {

    listOfBook.add(book);
    BookResponse<Book> response = new BookResponse<>("success", book);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @GetMapping("/getAll")
  public ResponseEntity<Object> getAll() {

    BookResponse<List<Book>> response = new BookResponse<>("success", listOfBook);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}
