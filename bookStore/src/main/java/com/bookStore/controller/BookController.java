package com.bookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.entity.Books;
import com.bookStore.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    
    @GetMapping("/book_register")
    public String bookRegister() {
    	return "bookRegister";
    }
    
    @GetMapping("/available_books")
    public ModelAndView availableBook() {
    	List<Books> list = bookService.getAllBook();
    	return new ModelAndView("availableBook","book",list);
    }
    
    @GetMapping("/my_books")
    public String myBooks() {
    	return "myBook";
    }
    
    @PostMapping("/save")
    public String addBook(@ModelAttribute Books books) {
    	bookService.save(books);
    	return "redirect:/available_books";
    }

}
