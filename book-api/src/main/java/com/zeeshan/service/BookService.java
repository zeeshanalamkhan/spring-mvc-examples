package com.zeeshan.service;

import java.util.List;

import com.zeeshan.model.Book;

public interface BookService {

	public Book findBookById(Long id);

	public List<Book> findAllBook();

	public Book saveBook(Book book);

	public Book updateBook(Long id, Book book);

	public String deleteBook(Long id);

}
