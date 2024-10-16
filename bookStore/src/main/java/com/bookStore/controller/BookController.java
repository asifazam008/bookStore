package com.bookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    
    @GetMapping("/book_register")
    public String bookRegister() {
    	return "bookRegister";
    }
    
    @GetMapping("/available_book")
    public String availableBook() {
    	return "availableBook";
    }
    
    @GetMapping("/my_book")
    public String myBooks() {
    	return "myBook";
    }

}
