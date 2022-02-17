package com.daniel.booksAPI.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daniel.booksAPI.models.Book;
import com.daniel.booksAPI.services.BookService;

@Controller
public class BookController {
	
	// import the BookService here
	private final BookService bookService;
	public BookController(BookService bookService) {
		this.bookService = bookService;
		
	}
	
    @RequestMapping("/books/{bookid}")
    public String  index(@PathVariable("bookid") Long bookid, Model model) {
        Book book = bookService.findBook(bookid);
        model.addAttribute("book", book);
        return "/show.jsp";
   
    }
    
    @RequestMapping("/books")
    public String index(Model model) {
    	List<Book> books = bookService.allBooks();
    	model.addAttribute("books", books);
    	return "/index.jsp";
    }
    
    
}
