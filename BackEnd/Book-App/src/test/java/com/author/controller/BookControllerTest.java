package com.author.controller;

import static org.mockito.Mockito.when;

import java.awt.print.Book;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mockitoSession;
import java.util.List;

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
		books.setemail("vijay@gmail.com");
		books.setImage("URL");
		books.setPublisher("Vr printers");
		when(iBookService.saveBook(books)).thenReturn(books);
		Books testbooks = bookController.createBook(books);
		assertEquals(books, testbooks);
		

	}

}
