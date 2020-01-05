package com.zeeshan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zeeshan.model.Book;
import com.zeeshan.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBook(@PathVariable Long id) {

		return new ResponseEntity<>(bookService.findBookById(id), HttpStatus.FOUND);
	}

	@GetMapping("/book")
	public ResponseEntity<List<Book>> getAllBook() {

		return new ResponseEntity<>(bookService.findAllBook(), HttpStatus.OK);
	}

	@PostMapping("/book")
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {

		return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.CREATED);
	}

	@PutMapping("/book/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {

		return new ResponseEntity<>(bookService.updateBook(id, book), HttpStatus.OK);
	}

	@DeleteMapping("/book/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Long id) {

		return new ResponseEntity<>(bookService.deleteBook(id), HttpStatus.OK);
	}

}
