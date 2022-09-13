package com.reader.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import com.reader.entity.ReaderEntity;

public interface IReaderService {

	

	public ReaderEntity buyBook(ReaderEntity readerEntity, Integer id);

}
