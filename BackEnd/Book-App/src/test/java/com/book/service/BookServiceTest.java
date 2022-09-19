package com.book.service;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.book.entity.Books;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

	@Mock
	BookRepository bookRepository;

	@InjectMocks
	BookServiceImpl bookServiceImpl;

	@Test
	void testsaveBook() {
		Books books = new Books();
		when(bookRepository.save(books)).thenReturn(books);
		assertEquals(books, bookServiceImpl.saveBook(books));
	}

	@Test
	void testGetAllBooks() {
		when(bookRepository.findAll()).thenReturn(new ArrayList<>());
		assertEquals(0, bookServiceImpl.getallBooks().size());
	}
	
	@Test
	void testGetBook() { 
		Books books = new Books();
	 when(bookRepository.findById(1)).thenReturn(Optional.of(books));
		assertEquals(Optional.of(books), bookServiceImpl.getBook(1));
		
	}

		
	@Test
	void testGetBookbyemail() {
		Books books = new Books();
		books.setEmail("test@gmail.com");
		 when(bookRepository.findByemail(books.getEmail())).thenReturn(new ArrayList<>());
			assertEquals(new ArrayList<>(), bookServiceImpl.getBookbyemail(books.getEmail()));
		
	}
	
	}

 