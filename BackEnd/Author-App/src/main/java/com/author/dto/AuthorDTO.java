package com.author.dto;

import java.util.List;

import com.author.entity.Books;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class AuthorDTO {
	private String email;
	private String authorName;
	private String password;

	private List<Books> books;

	
}
