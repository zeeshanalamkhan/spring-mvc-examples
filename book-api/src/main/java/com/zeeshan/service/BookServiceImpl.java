package com.zeeshan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeeshan.model.Book;
import com.zeeshan.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book findBookById(Long id) {
		Book book = bookRepository.findById(id);
		return book;
	}

	@Override
	public List<Book> findAllBook() {
		List<Book> listBook = bookRepository.findAll();
		return listBook;
	}

	@Override
	public Book saveBook(Book book) {

		Book book2 = bookRepository.save(book);
		return book2;
	}

	@Override
	public Book updateBook(Long id, Book book) {

		Book book2 = bookRepository.update(id, book);
		return book2;
	}

	@Override
	public String deleteBook(Long id) {

		bookRepository.delete(id);
		return "Book with id: " + id + " deleted successfully...";
	}

}
