package com.bookstore.service;

import java.util.List;

import jakarta.persistence.EntityNotFoundException;

import com.bookstore.entity.Books;

import org.springframework.stereotype.Service;

import com.bookstore.repo.BookRepository;

@Service
public class BookService {

	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public void save(Books books) {
		bookRepository.save(books);
	}

	public List<Books> getAllBook() {
		return bookRepository.findAll();
	}

	public Books getBookById(int id) {
		return bookRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Book not found"));
	}

}
