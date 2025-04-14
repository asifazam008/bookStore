package com.bookStore.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	private String name;
	private string email;
	
	private String author;
	
	private String price;
	
}
