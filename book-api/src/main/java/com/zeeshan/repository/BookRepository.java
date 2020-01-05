package com.zeeshan.repository;

import java.util.List;

import com.zeeshan.model.Book;

public interface BookRepository {

	public Book findById(Long id);

	public List<Book> findAll();

	public Book save(Book book);

	public Book update(Long id, Book book);

	public void delete(Long id);

}
