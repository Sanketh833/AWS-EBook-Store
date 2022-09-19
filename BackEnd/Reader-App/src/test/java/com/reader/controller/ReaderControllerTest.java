package com.reader.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
 
import com.reader.entity.ReaderEntity;
import com.reader.service.IReaderService;

@ExtendWith(MockitoExtension.class)
public class ReaderControllerTest {

	@Mock
	IReaderService iReaderService;

	@InjectMocks
	ReaderController readerController;

	@Test
	void testBuyBook() {
		ReaderEntity readerEntity = new ReaderEntity();
		readerEntity.setId(1);
		 
		when(iReaderService.buyBook(readerEntity, readerEntity.getId())).thenReturn(readerEntity);   
		assertEquals(readerEntity, readerController.buyBook(readerEntity, readerEntity.getId()));

	}
	
	
}
