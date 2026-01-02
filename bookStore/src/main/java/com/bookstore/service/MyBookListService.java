package com.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.bookstore.repo.MyBookRepository;
import com.bookstore.entity.MyBookList;
@Service
public class MyBookListService {
	
	private MyBookRepository myBookRepository;

	public MyBookListService(MyBookRepository myBookRepository) {
		this.myBookRepository = myBookRepository;
	}

	public void saveMyBooks(MyBookList bookList) {
		myBookRepository.save(bookList);
	}
	
	public List<MyBookList> getAllBooks(){
		return myBookRepository.findAll();
	}
	
	public void deleteById(int id) {
		myBookRepository.deleteById(id);
	}
}
