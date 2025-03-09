package com.bookStore.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.bookStore.entity.Books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Books;
import com.bookStore.repo.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

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
