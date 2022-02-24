package com.daniel.loginandregistration.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.daniel.loginandregistration.models.Book;
import com.daniel.loginandregistration.models.User;
import com.daniel.loginandregistration.service.BookService;
import com.daniel.loginandregistration.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userServ;
	
	@Autowired
	private BookService bookServ;
	
	
	// Logged in from here 
	// home route
	// can move this to other controller
	
	@GetMapping("/home")
	public String home(HttpSession sesh, 
						Model model) {
		//retrieve the DB using session id
		Long userId = (Long) sesh.getAttribute("user_id");
		//check if userID is null
		if (userId == null) {
			return "redirect:/home";
		} else {
			// Show all books on page
			List<Book> allBooks = bookServ.allBooks();
			model.addAttribute("allBooks", allBooks);
			//go to the DB to retrieve the user using the id
			User thisUser = userServ.findOne(userId);
			model.addAttribute("thisUser", thisUser);
			return "home.jsp";
		}
	}
	
	
	// ################# Show one book ###########
	@GetMapping("/books/{id}")
	public String showOne(@PathVariable("id") Long id,
							Model model) {
		Book oneBook = bookServ.findBook(id);
		model.addAttribute("oneBook", oneBook);
		return "/books/show.jsp";
	}
	
	// ################# Create Book #### JSP #####
	@GetMapping("/books/new")
	public String book(@ModelAttribute ("book") Book book,
						Model model, HttpSession sesh) {
		
		// Route Guard - check if user is in session
		Long userId = (Long) sesh.getAttribute("user_id");
		//check if userID is null
		if (userId == null) {
			return "redirect:/";
		} else {
			User loggedInUser = userServ.findOne(userId);
			model.addAttribute("loggedInUser", loggedInUser);
		return "/books/new.jsp";
		}
	}
	
	// ################## Create Book Method #########
	@PostMapping("/books")
	public String create (@Valid @ModelAttribute("book") Book book,
							BindingResult result, Model model,
							HttpSession sesh) {
		if(result.hasErrors()) {
			Long userId = (Long) sesh.getAttribute("user_id");
			User loggedInUser = userServ.findOne(userId);
			model.addAttribute("loggedInUser", loggedInUser);
			return "/books/new.jsp";
		} else {
			bookServ.createBook(book);
			return "redirect:/home";
		}
		
	}
	
	
	//  ################## Edit ##### JSP #######
	@RequestMapping("/books/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Book book = bookServ.findBook(id);
		model.addAttribute("book", book);
		return "/books/edit.jsp";
	}
	
	//  ############## Edit Method #############
	@PutMapping("/books/{id}")
	@RequestMapping(value = "/books/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("book") Book book, 
							BindingResult result) {
		if(result.hasErrors()) {
			return "/books/edit.jsp";
		} else {
			bookServ.updateBook(book);
			return "redirect:/home";
		}
	}
	
	// ########### Delete ###########
	@RequestMapping(value = "books/{id}/delete", method = RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		bookServ.deleteBook(id);
		return "redirect:/home";
	}
	
	
	





}


