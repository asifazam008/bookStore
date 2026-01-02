package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.entity.Books;
import com.bookstore.entity.MyBookList;
import com.bookstore.service.*;

@Controller
public class BookController {

    private BookService bookService;

    private MyBookListService bookListService;

    public BookController(BookService bookService, MyBookListService bookListService) {
        this.bookService = bookService;
        this.bookListService = bookListService;
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister() {
        return "bookRegister";
    }

    @GetMapping("/available_book")
    public ModelAndView availableBook() {
        List<Books> list = bookService.getAllBook();
        return new ModelAndView("availableBook", "book", list);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Books books) {
        bookService.save(books);
        return "redirect:/available_books";
    }

    @GetMapping("/my_book")
    public String getMyBooks(Model model) {
        List<MyBookList> list = bookListService.getAllBooks();
        model.addAttribute("book", list);
        return "myBook";
    }

    @RequestMapping("myList/{id}")
    public String getMyList(@PathVariable("id") int id) {
        Books books = bookService.getBookById(id);
        MyBookList myBookList = new MyBookList(books.getName(), books.getAuthor(), books.getPrice());
        bookListService.saveMyBooks(myBookList);
        return "redirect:/my_book";
    }

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id) {
        bookListService.deleteById(id);
        return "redirect:/my_book";
    }

    @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") int id, Model model) {
        Books books = bookService.getBookById(id);
        model.addAttribute("book", books);
        return "bookEdit";
    }

}
