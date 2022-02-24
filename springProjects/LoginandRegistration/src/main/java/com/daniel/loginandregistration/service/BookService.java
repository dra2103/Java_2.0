package com.daniel.loginandregistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.loginandregistration.models.Book;
import com.daniel.loginandregistration.repos.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepo;
	
	
	// returns all books
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	
	// create book
	public Book createBook(Book b) {
		return bookRepo.save(b);
	}
	
	// update
	public Book updateBook(Book b) {
		return bookRepo.save(b);
	}
	
	// retrieve book
	public Book findBook (Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
	// Delete
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	

}
