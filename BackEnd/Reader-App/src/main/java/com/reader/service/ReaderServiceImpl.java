package com.reader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reader.entity.ReaderEntity;

@Service
public class ReaderServiceImpl implements IReaderService {

	@Autowired
	ReaderRepository readerRepository;

	@Override
	public ReaderEntity buyBook(ReaderEntity readerEntity, Integer id) {
		return readerRepository.save(readerEntity);
	}

}
