package com.author.controller;

import static org.mockito.Mockito.when;

import java.awt.print.Book;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mockitoSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.book.controller.BookController;
import com.book.entity.Books;
import com.book.service.IBookService;

@ExtendWith(MockitoExtension.class)
public class BookControllerTest {

	@Mock
	IBookService iBookService;

	@InjectMocks
	BookController bookController;
	 
	 

	@Test
	void testCreatebooks() {

		Books books = new Books();
		books.setId(100);
		books.setTitle("The KingKong");
		books.setAuthorName("vijay");
		books.setContent("Suspense thriller");
		books.setCategory("Suspense");
		books.setEmail("vijay@gmail.com");
		books.setImage("URL");
		books.setPublisher("Vr printers");
		when(iBookService.saveBook(books)).thenReturn(books);
		assertEquals(books, bookController.createBook(books));

	}

	@Test
	void testGetallbooks() {
		when(iBookService.getallBooks()).thenReturn(new ArrayList<>());
		assertEquals(0, bookController.getAllBooks().size());

	}

	@Test
	void testGetbook() {    
		Books books = new Books();
	 when(iBookService.getBook(1)).thenReturn(Optional.of(books));
		assertEquals(books, bookController.getBook(1));
		}
	
	@Test
	void testGetbookbyid() {
		Books books = new Books();	
		books.setEmail("test@gmail.com");
		when(iBookService.getBookbyemail(books.getEmail())).thenReturn(new ArrayList<Books>());
		assertEquals(books, bookController.getBookbyaid(books.getEmail()).size());
		
	}
	
	@Test
	void testSerachBooks() {
		
		
	}

	
//	@Test
//	void testDeletebook() {
//		Books books = new Books(); 
//		when(iBookService.deleteBook(1)).thenReturn(new ArrayList<Books>());
//		assertEquals(books, bookController.getBookbyaid("ajit@gmail.com").size());
//		
//	}
	
//	@Test
//	void testDeletebooks() {
//		when(iBookService.deleteallBooks()).thenRe
//		assertEquals(0, bookController.getAllBooks().size());
//
//		
//	}
}
