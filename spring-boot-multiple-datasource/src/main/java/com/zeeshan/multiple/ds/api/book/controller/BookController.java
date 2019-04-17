package com.zeeshan.multiple.ds.api.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zeeshan.multiple.ds.api.book.service.BookService;
import com.zeeshan.multiple.ds.api.model.book.Book;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Book> findBookById(@PathVariable int id) {
		return bookService.getBookById(id);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Book> allBooks() {
		return bookService.findAllBooks();
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
}
