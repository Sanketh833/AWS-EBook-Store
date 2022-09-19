package com.author.testcontroller;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.author.controller.AuthorController;
import com.author.dto.AuthorDTO;
import com.author.entity.Author;
import com.author.service.AuthorServiceInterface; 
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class AuthorControllerTest {

	@Mock
	AuthorServiceInterface authorServiceInterface;

	@InjectMocks
	AuthorController authorController;

	@Test
	void testcreateauthor() {

		Author author = new Author();
		author.setEmail("test@gmail.com");
		when(authorServiceInterface.saveAuthor(author)).thenReturn(author);
		assertEquals(author, authorController.createAuthor(author));
	}

	@Test
	void testlogin() {

		AuthorDTO authorDTO = new AuthorDTO();
		authorDTO.setEmail("sanketh@gmail.com");
		authorDTO.setPassword("123jak");
		when(authorServiceInterface.login(authorDTO)).thenReturn(true, false); 
		boolean testauthordto = authorController.login(authorDTO);
		assertEquals(true|| false, testauthordto);
	}

	

}
