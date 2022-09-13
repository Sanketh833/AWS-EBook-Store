package com.reader.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class ReaderEntity {

	@Id
	
	private String readerEmail;
	private String readerName;
	private Long cardNumber;
	private Long cvv;
	private Integer id;
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer paymentid;

	public ReaderEntity(String readerEmail, String readerName, Long cardNumber, Long cvv, Integer id,
			Integer paymentid) {
		super();
		this.readerEmail = readerEmail;
		this.readerName = readerName;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.id = id;
		this.paymentid = paymentid;
	}

	public ReaderEntity() {
		super();
	}

//	public String getReaderEmail() {
//		return readerEmail;
//	}
//
//	public void setReaderEmail(String readerEmail) {
//		this.readerEmail = readerEmail;
//	}
//
//	public String getReaderName() {
//		return readerName;
//	}
//
//	public void setReaderName(String readerName) {
//		this.readerName = readerName;
//	}
//
//	public Long getCardNumber() {
//		return cardNumber;
//	}
//
//	public void setCardNumber(Long cardNumber) {
//		this.cardNumber = cardNumber;
//	}
//
//	public Long getCvv() {
//		return cvv;
//	}
//
//	public void setCvv(Long cvv) {
//		this.cvv = cvv;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}

}
