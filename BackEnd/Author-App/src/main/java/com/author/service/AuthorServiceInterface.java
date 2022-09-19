package com.author.service;


import java.util.List;
import java.util.Optional;

import com.author.dto.AuthorDTO;
import com.author.entity.Author;


public interface AuthorServiceInterface {

	Author saveAuthor(Author author);

	Author getbook(String email);

	boolean login(AuthorDTO authorDTO);
 
}
