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
import com.author.entity.Books;
import com.author.service.IAuthorService;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.boolean_expr_return;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mockitoSession;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@ExtendWith(MockitoExtension.class)
public class AuthorControllerTest {

	@Mock
	IAuthorService iauthorService;

	@InjectMocks
	AuthorController authorController;

	@Test
	void testcreateauthor() {

		Author author = new Author();
		author.setEmail("test@gmail.com");
		when(iauthorService.saveAuthor(author)).thenReturn(author);
		assertEquals(author, authorController.createAuthor(author));
	}

	@Test
	void testlogin() {

		AuthorDTO authorDTO = new AuthorDTO();
		authorDTO.setEmail("sanketh@gmail.com");
		authorDTO.setPassword("123jak");
		when(iauthorService.login(authorDTO)).thenReturn(true, false); //thenReturn(new Boolean(true || false));
		boolean testauthordto = authorController.login(authorDTO);
		assertEquals(true|| false, testauthordto);
	}

	
	
	@Test
	void testgetbook() {	
		Author author = new Author();
		author.setEmail("test@gmail.com");
		
		RestTemplate restTemplate = new RestTemplate();
		
		when(iauthorService.getbook(author.getEmail())).thenReturn(author);
		assertEquals(author, authorController.getbook(author.getEmail()));
		

when(restTemplate.getForObject("http://localhost:8083/getbookbyemail/", List.class)).thenReturn(List<author>());

	}

}
