package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.book.entity.Books;

public interface BookRepository extends JpaRepository<Books, Integer>{
	
	
	@Query(value = "SELECT * FROM book.books WHERE email=?1", nativeQuery = true)
	public List<Books> findByemail(String email);
	
	
	

}
