package com.author.testservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.author.dto.AuthorDTO;
import com.author.entity.Author;
import com.author.service.AutorService;
import com.author.service.IAuthorRepository; 
@ExtendWith(MockitoExtension.class)
public class AuthorServiceTest  {

	@Mock
	IAuthorRepository iauthorRepository;
	
	@InjectMocks
	AutorService authorservice;
	
	@Test
	void testSaveauthor() {
		
		Author author = new Author();
		author.setEmail("sanketh@gmail.com");
		when(iauthorRepository.save(author)).thenReturn(author);   
		assertEquals(author, authorservice.saveAuthor(author));
	}
	
	
	@Test
	void testlogin() {
		
		AuthorDTO authorDTO = new AuthorDTO();
		authorDTO.setEmail("test@gmail.com");
		authorDTO.setPassword("123jak");
		
		when(iauthorRepository.findById(authorDTO.getEmail()));
	}
	
	@Test
	void testgetBook() {
		Author author = new Author();  
		String email = "test@gmail.com";
		when(iauthorRepository.findById(email)).thenReturn(Optional.of(author));
		assertEquals(author, authorservice.getbook(email));
		
		
	}
}
