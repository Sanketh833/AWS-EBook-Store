package com.reader.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Books {
			private Integer id;
			private String title;
			private String category;
			private String image;
			private Long price;
			private String publisher;
			private Boolean active;
			private String content;
			private String authorName;
			 
}
