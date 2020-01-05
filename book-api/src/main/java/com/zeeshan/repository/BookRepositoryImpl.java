package com.zeeshan.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zeeshan.model.Book;

@Repository
@Transactional
public class BookRepositoryImpl implements BookRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Book findById(Long id) {

		Book book = sessionFactory.getCurrentSession().get(Book.class, id);
		return book;
	}

	@Override
	public List<Book> findAll() {

		List<Book> listBook = sessionFactory.getCurrentSession().createCriteria(Book.class).list();
		return listBook;
	}

	@Override
	public Book save(Book book) {

		Long id = (Long) sessionFactory.getCurrentSession().save(book);
		return findById(id);
	}

	@Override
	public Book update(Long id, Book book) {

		Book book2 = findById(id);
		book2.setAuthor(book.getAuthor());
		book2.setTitle(book.getTitle());
		sessionFactory.getCurrentSession().flush();

		return book2;
	}

	@Override
	public void delete(Long id) {

		Book book = findById(id);
		sessionFactory.getCurrentSession().delete(book);
	}

}
