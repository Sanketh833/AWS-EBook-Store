package com.reader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reader.entity.ReaderEntity;

@Service
public class ReaderServiceImpl implements IReaderService {

	@Autowired
	IReaderRepository ireaderRepository;

	@Override
	public String buyBook(ReaderEntity readerEntity) {
		ReaderEntity savedReaderEntity = ireaderRepository.save(readerEntity);
		return savedReaderEntity.getReaderEmail();
	}

}
