package com.author.entity;

import java.math.BigDecimal;

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

public class Books {

		private Integer id;
		private String title;
		private String category; 
		private String image;
		private BigDecimal price; //big decimal
		private String publisher;
		private Boolean active;
		private String content;
		private String authorUserName;
		private Integer aId;
		
		
		
}
