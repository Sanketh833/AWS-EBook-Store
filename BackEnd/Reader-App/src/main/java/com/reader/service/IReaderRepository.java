package com.reader.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
 
import com.reader.entity.ReaderEntity;

public interface IReaderRepository extends JpaRepository<ReaderEntity, String>{
	
	 
	
	

}
