package com.reader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.reader.dto.Books;
import com.reader.entity.ReaderEntity;
import com.reader.service.IReaderService;

@CrossOrigin
@RestController
public class ReaderController {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	IReaderService iReaderService;

//	@GetMapping("/readersearchBooks")
//	public  List<Books> searchBooks(@RequestParam(name = "category",required = false)  String category,
//			@RequestParam (name = "authorName",required = false) String authorName,
//			@RequestParam  (name = "price",required = false) Long price)
//	{ 
//		List<Books> books= this.restTemplate.getForObject(
//		"http://localhost:8083/searchbooks?category={category}&authorName={authorName}&price={price}",
//				List.class,category,authorName,price);
//	 
//		return books;

//	}

//	@GetMapping("/search/{category}/{author}/price}/{publisher}")
//	
//	public  List<Books> searchBooks2(@PathVariable C)
//	{ 
//		List<Books> books= this.restTemplate.getForObject(
//		"http://localhost:8083/searchbooks?category={category}&authorName={authorName}&price={price}",
//				List.class,category,authorName,price);
//
//		return books;
//	}

	@PostMapping("/buy/{id}")
	public ReaderEntity buyBook(@RequestBody ReaderEntity readerEntity , @PathVariable("id") Integer id) {

		ReaderEntity buyBookforReader = iReaderService.buyBook(readerEntity, id);
		return buyBookforReader;
	}

	@GetMapping("/getspecificbook/{id}")
	public ResponseEntity<Books> getbook(@PathVariable("id") Integer id) {
		ResponseEntity<Books> book = this.restTemplate.getForEntity("http://localhost:8083/getbook/" + id, Books.class);

		return book;
	}

}
