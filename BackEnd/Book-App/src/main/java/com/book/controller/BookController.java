package com.book.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Books;
import com.book.service.IBookService;

@CrossOrigin
@RestController
public class BookController {
	@Autowired
	IBookService bookService;

	@PostMapping("/book")
	public Books createBook(@RequestBody Books book) {
		Books newbook = bookService.saveBook(book);
		return newbook;
	}

	@GetMapping("/allBooks")
	public List<Books> getAllBooks() {
		return bookService.getallBooks();

	}

	@GetMapping("/getbook/{id}")
	public Optional<Books> getBook(@PathVariable Integer id) {
		Optional<Books> book = bookService.getBook(id);
		return book;
	}

	@GetMapping("/getbookbyemail/{email}")
	public List<Books> getBookbyId(@PathVariable String email) {
		List<Books> book = bookService.getBookbyemail(email);
		return book;
	}



	@GetMapping("/searchbooks/{category}/{authorname}/{price}/{publisher}")

	public List<Books> searchBooks(@PathVariable String category, @PathVariable String authorname,
			@PathVariable BigDecimal price, @PathVariable String publisher) {

		return bookService.searchbooks(category, authorname, price, publisher);

	}

	@DeleteMapping("/book/{id}")
	public ResponseEntity<Books> deleteBook(@PathVariable Integer id) { 
		ResponseEntity<Books> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			bookService.deleteBook(id);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

	@DeleteMapping("/deleteall")
	public String deleteBooks() {
		bookService.deleteallBooks();
		return "Deleted all employees";
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Books> updateBook(@PathVariable("id") Integer id, @RequestBody Books book) {
		return new ResponseEntity<Books>(bookService.updateBook(book, id), HttpStatus.OK);
	}

}
