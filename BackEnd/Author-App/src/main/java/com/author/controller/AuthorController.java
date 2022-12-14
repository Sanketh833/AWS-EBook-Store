package com.author.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.author.dto.AuthorDTO;
import com.author.entity.Author;
import com.author.entity.Books;
import com.author.service.AuthorServiceInterface; 
@CrossOrigin
@RestController
public class AuthorController {
	@Autowired
	AuthorServiceInterface authorService;

	@Autowired
	private RestTemplate restTemplate;

//	create a new Author 
	@PostMapping("/author")
	public Author createAuthor(@RequestBody Author author) {
		return authorService.saveAuthor(author);
	}

//	Author Login

	@PostMapping("/login")
	public boolean login(@RequestBody AuthorDTO authorDTO) {
		authorDTO.getEmail();
		authorDTO.getPassword();
		return authorService.login(authorDTO);

	}
	 
	
	@GetMapping("/{email}")
	public AuthorDTO getbook(@PathVariable("email") String email) {
		Author author = this.authorService.getbook(email);

		String url = "http://localhost:8083/getbookbyemail/";

		List<Books> books = this.restTemplate.getForObject(url + email, List.class);

		AuthorDTO authorDTO = new AuthorDTO();
		authorDTO.setEmail(author.getEmail());
		authorDTO.setAuthorName(author.getAuthorName());
		authorDTO.setPassword(author.getPassword());
		authorDTO.setBooks(books);
		return authorDTO;
	}

}
