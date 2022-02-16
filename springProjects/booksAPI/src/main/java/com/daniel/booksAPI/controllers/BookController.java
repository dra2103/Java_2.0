package com.daniel.booksAPI.controllers;

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
	
    @RequestMapping("/books/{id}")
    public String  index(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "/show.jsp";
   
    }
}
