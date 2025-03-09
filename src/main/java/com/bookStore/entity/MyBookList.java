package com.bookStore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
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
