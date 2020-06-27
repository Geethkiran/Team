package com.bridgelabz.bookstore.model;


import javax.persistence.Entity;
import javax.persistence.Table;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;


@Entity
@Table(name = "AdminTable")
@Data
public class AdminModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adminId")
	private Long adminId;
	
	private String adminName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "sellerId")
	private List<SellerModel> sellers;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private List<UserModel> users;
	 
}
