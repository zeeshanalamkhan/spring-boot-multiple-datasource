package com.zeeshan.multiple.ds.api.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.zeeshan.multiple.ds.api.book.repository.BookRepository;
import com.zeeshan.multiple.ds.api.model.book.Book;

@Service
@EnableTransactionManagement
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Optional<Book> getBookById(int id) {
		return bookRepository.findById(id);
	}

	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}

	@Transactional
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}
}
