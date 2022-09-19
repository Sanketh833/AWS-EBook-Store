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


	@PostMapping("/buy/{id}")
	public ReaderEntity buyBook(@RequestBody ReaderEntity readerEntity , @PathVariable("id") Integer id) {

		return iReaderService.buyBook(readerEntity, id);
	}

	@GetMapping("/getspecificbook/{id}")
	public ResponseEntity<Books> getbook(@PathVariable("id") Integer id) {
		return this.restTemplate.getForEntity("http://localhost:8083/getbook/" + id, Books.class);
	}

}
