package com.book.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Books;
import com.book.exception.ResourceNotFoundException;

@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	BookRepository bookRepository;

	@Override
	public Books saveBook(Books books) {
		Books savedAuthor = bookRepository.save(books);
		return savedAuthor; 

	}

	@Override
	public List<Books> getallBooks() {

		return bookRepository.findAll();
	}

	@Override
	public Optional<Books> getBook(Integer id) { 
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
		Books existingBook = bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book", "id", id));

		existingBook.setAuthorName(book.getAuthorName());
		existingBook.setActive(book.getActive());
		existingBook.setCategory(book.getCategory());
		existingBook.setContent(book.getContent());
		existingBook.setImage(book.getImage());
		existingBook.setPrice(book.getPrice());
		existingBook.setPublisher(book.getPublisher());
 
		bookRepository.save(existingBook);
		return existingBook;
	}

	@Override
	public List<Books> getBookbyemail(String email) { 
		return bookRepository.findByemail(email);
	}

	@Override
	public List<Books> searchbooks(String category, String authorname, BigDecimal price, String publisher) {
		List<Books> booklist = bookRepository.findAll();

		return booklist.stream()
				.filter(n -> n.getCategory().equals(category)
						|| n.getAuthorName().equalsIgnoreCase(authorname) || n.getPrice().equals(price))
				.collect(Collectors.toList());
	}

}
