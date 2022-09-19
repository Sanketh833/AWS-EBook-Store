package com.reader.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.reader.entity.ReaderEntity;

@ExtendWith(MockitoExtension.class)
public class ReaderServiceTest {

	@Mock
	ReaderRepository readerRepository;
	
	@InjectMocks
	ReaderServiceImpl readerServiceImpl;
	
	
	@Test
	void testBuyBook() {
		
		ReaderEntity readerEntity = new ReaderEntity();
		readerEntity.setId(1);
		 
		when(readerRepository.save(readerEntity)).thenReturn(readerEntity);   
		assertEquals(readerEntity, readerServiceImpl.buyBook(readerEntity, readerEntity.getId()));

	}
	
}
