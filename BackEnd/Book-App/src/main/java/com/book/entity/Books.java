package com.book.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.reader.enumerated.Category;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity

public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String title;

		@Enumerated(EnumType.STRING)
	private Category category; // enum
	private String image;
	private BigDecimal price; // bigdecimal
	private String publisher;
	private Boolean active;
	private String content;
	private String authorName;
	private String email;

//		public Integer getId() {
//			return id;
//		}
//		public void setId(Integer id) {
//			this.id = id;
//		}
//		public String getTitle() {
//			return title;
//		}
//		public void setTitle(String title) {
//			this.title = title;
//		}
//		
//		public String getCategory() {
//			return category;
//		}
//		public void setCategory(String category) {
//			this.category = category;
//		}
//		public String getImage() {
//			return image;
//		}
//		public void setImage(String image) {
//			this.image = image;
//		}
//		
//		
//		public BigDecimal getPrice() {
//			return price;
//		}
//		public void setPrice(BigDecimal price) {
//			this.price = price;
//		}
//		public String getPublisher() {
//			return publisher;
//		}
//		public void setPublisher(String publisher) {
//			this.publisher = publisher;
//		}
//		public Boolean getActive() {
//			return active;
//		}
//		public void setActive(Boolean active) {
//			this.active = active;
//		}
//		public String getContent() {
//			return content;
//		}
//		public void setContent(String content) {
//			this.content = content;
//		}
//		public String getAuthorName() {
//			return authorName;
//		}
//		public void setAuthorName(String authorName) {
//			this.authorName = authorName;
//		}
//		public String getEmail() {
//			return email;
//		}
//		public void setEmail(String email) {
//			this.email = email;
//		}
//		

//	public Books(Integer id, String title, String category, String image, BigDecimal price, String publisher,
//			Boolean active, String content, String authorName, String email) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.category = category;
//		this.image = image;
//		this.price = price;
//		this.publisher = publisher;
//		this.active = active;
//		this.content = content;
//		this.authorName = authorName;
//		this.email = email;
//	}
//
//	public Books() {
//		super();
//	}

}
