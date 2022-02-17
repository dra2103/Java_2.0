package com.daniel.booksAPI.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	// Renders the  Create Page
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "new.jsp";
	}
	// Create Book
	
	@PostMapping("/books")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "/new.jsp";
		}else {
			bookService.createBook(book);
			return "redirect:/books";	
		}
	}
	// Show one book
	
    @RequestMapping("/books/{bookid}")
    public String  index(@PathVariable("bookid") Long bookid, Model model) {
        Book book = bookService.findBook(bookid);
        model.addAttribute("book", book);
        return "/show.jsp";
   
    }
    
    // Home page and show all books
    
    @RequestMapping("/books")
    public String index(Model model) {
    	List<Book> books = bookService.allBooks();
    	model.addAttribute("books", books);
    	return "/index.jsp";
    }
    
    
}
