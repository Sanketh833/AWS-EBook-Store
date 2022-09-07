package com.book.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Books;
import com.book.exception.ResourceNotFoundException;
@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	IBookRepository bookRepository;

	@Override
	public Books saveBook(Books books) {
		Books savedAuthor = bookRepository.save(books);
		return savedAuthor;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Books> getallBooks() {
		
		return bookRepository.findAll();
	}

	@Override
	public Optional<Books> getBook(Integer id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}

	@Override
	public void deleteBook(Integer id) {
		bookRepository.deleteById(id);
		
	}

	@Override
	public void deleteallBooks() {
		bookRepository.deleteAll();
		
	}

	@Override
	public Books updateBook(Books book, Integer id) {
		// TODO Auto-generated method stub
		Books existingBook = bookRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Employee", "id", id));
				
		existingBook.setAuthorName(book.getAuthorName());
		existingBook.setActive(book.getActive());
		existingBook.setCategory(book.getCategory());
		existingBook.setContent(book.getContent());
		existingBook.setImage(book.getImage());
		existingBook.setPrice(book.getPrice());
		existingBook.setPublisher(book.getPublisher());
				
				//the details are updated and then saving the updated value
		bookRepository.save(existingBook);
		return existingBook;
	}

	@Override
	public List<Books> getBookbyemail(String email) {
		// TODO Auto-generated method stub
		
		return bookRepository.findByemail(email);
	}

	@Override
	public List<Books> searchbooks(String category, String authorName, long price) {
		List<Books> booklist=	bookRepository.findAll();
		return booklist.stream().filter(n->n.getCategory().equalsIgnoreCase(category) ||
				n.getAuthorName().equalsIgnoreCase(authorName) || 
				n.getPrice().equals(price))
				.collect(Collectors.toList());
	}
}

	
	
		

