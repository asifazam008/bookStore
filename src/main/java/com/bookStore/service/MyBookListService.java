package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookStore.repo.MyBookRepository;
import com.bookStore.entity.MyBookList;
@Service
public class MyBookListService {
	
	@Autowired
	private MyBookRepository myBookRepository;

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
