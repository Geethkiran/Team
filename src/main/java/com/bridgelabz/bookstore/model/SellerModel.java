package com.bridgelabz.bookstore.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name = "Seller")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SellerModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sellerId")
	private Long sellerId;
	
	private String sellerName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookId")
	private List<BookModel> books;
}
