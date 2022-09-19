package com.reader.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReaderEntity {

	@Id
	
	private String readerEmail;
	private String readerName;
	private Long cardNumber;
	private Long cvv;
	private Integer id;
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer paymentid;

	 
}
