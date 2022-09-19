package com.author.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.author.dto.AuthorDTO;
import com.author.entity.Author;

import com.author.exception.ResourceNotFoundException;
@Service
public class AutorService implements AuthorServiceInterface
//UserDetailsService 
{
	@Autowired
	IAuthorRepository authorRepository;

	@Override  
	public Author saveAuthor(Author author) {
		Author savedAuthor = authorRepository.save(author);
		return savedAuthor; 
	}

	

	@Override
	public boolean login(AuthorDTO authorDTO) {
		
		authorDTO.getEmail(); authorDTO.getPassword();
		
		Author author = authorRepository.findById(authorDTO.getEmail()).get();
		if(author!= null && author.getPassword().equals(authorDTO.getPassword())) {
			return true;
		}
		return false;
	}
 

	@Override
	public Author getbook(String email) { 
		Optional<Author> author=	authorRepository.findById(email);
		return author.get();
	
	}
}
	
	
		

