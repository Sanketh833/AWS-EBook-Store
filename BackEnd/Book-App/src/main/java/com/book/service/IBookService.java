package com.book.service;


import java.util.List;
import java.util.Optional;

import com.book.entity.Books;

public interface IBookService {

	Books saveBook(Books books);

	List<Books> getallBooks();
	
	public Optional<Books> getBook(Integer id);

	void deleteBook(Integer id);

	void deleteallBooks();

	Books updateBook(Books book, Integer id);

	

	List<Books> searchbooks(String category, String authorName, long price);



	List<Books> getBookbyemail(String email);
}
