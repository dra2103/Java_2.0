package com.daniel.booksAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.daniel.booksAPI.models.Book;
import com.daniel.booksAPI.repos.BookRepo;

@Service
public class BookService {
	
    // adding the book repository as a dependency
	private final BookRepo bookRepository;
    
    public BookService(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public Book updateBook(Long id, String title, String description, String lang, Integer numOfPages) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
        	Book updatedBook = optionalBook.get();
        	updatedBook.setTitle(title);
        	updatedBook.setDescription(description);
        	updatedBook.setLanguage(lang);
        	updatedBook.setNumberOfPages(numOfPages);
        	return bookRepository.save(updatedBook);
        }else {
        	return null;
        }

    }
    
    public Book delete(Long id) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
    	if(optionalBook.isPresent()) {
    		bookRepository.deleteById(id);
    	}
		return null;
    }
}

