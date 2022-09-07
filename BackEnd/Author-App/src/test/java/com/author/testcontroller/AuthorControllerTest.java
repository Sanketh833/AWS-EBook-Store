//package com.author.testcontroller;
//
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import com.author.controller.AuthorController;
//import com.author.dto.AuthorDTO;
//import com.author.entity.Author;
//import com.author.service.IAuthorService;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.fail;
//import static org.mockito.Mockito.mockitoSession;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.http.ResponseEntity;
//
//@ExtendWith(MockitoExtension.class)
//public class AuthorControllerTest {
//
//	@Mock
//	IAuthorService iauthorService;
//
//	@InjectMocks
//	AuthorController authorController;
//
//	@Test
//	void testcreateauthor() {
//
//		Author author = new Author();
//		author.setEmail("sanketh@gmail.com");
//		when(iauthorService.saveAuthor(author)).thenReturn(author); 
//		Author testauthor = authorController.createAuthor(author);// saveUser(author);
//		assertEquals(author, testauthor);
//	}
	
	
//	@Test
//	void testlogin() {
//		
//		AuthorDTO authorDTO = new AuthorDTO();
//		authorDTO.setEmail("sanketh@gmail.com");
//		authorDTO.setPassword("123jak");
//		when(iauthorService.login(authorDTO)).thenReturn(true);
//	boolean testauthordto =	authorController.login(authorDTO);
//		assertEquals(authorDTO, testauthordto);
//	}
	
	
	
	
	
	
	

//	@Test
//	void testgetbook() {	
//		Author author = new Author();
//		String s = "sanketh@gmail.com";
//		when(iauthorService.getbook(s)).thenReturn(author);
//		assertEquals(author, testauthor);

//	}

//}
