//package com.author.testservice;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import com.author.entity.Author;
//import com.author.service.IAuthorRepository;
//import com.author.service.IAuthorService;
//
//@ExtendWith(MockitoExtension.class)
//public class AuthorServiceTest {
//
//	@Mock
//	IAuthorRepository iauthorRepository;
//	
//	
//	@Test
//	void testSaveauthor() {
//		
//		Author author = new Author();
//		author.setEmail("sanketh@gmail.com");
//		when(iauthorRepository.save(author)).thenReturn(author); 
//		Author testauthor = iauthorService.saveAuthor(author);     
//		assertEquals(author, testauthor);
//	}
//	
//}
