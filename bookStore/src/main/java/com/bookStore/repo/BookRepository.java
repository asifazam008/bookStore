package com.bookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bookStore.entity.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer>{

}
