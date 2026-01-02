package com.bookstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
@Table(name="MyBooks")
public class MyBookList {

	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String author;
	private String price;
	
	public MyBookList(String name, String author, String price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
}
