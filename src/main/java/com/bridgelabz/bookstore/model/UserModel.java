package com.bridgelabz.bookstore.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.regex.Matcher;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.bridgelabz.bookstore.enums.RoleType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	private long userId;

	@NotNull
	@Size(min = 3)
	@Pattern(regexp = "^[A-Z][a-z]+\\s?[A-Z][a-z]+$", message = "Please Enter Valid FullName")
	private String fullName;

	@Email
	@Column(unique = true)
	private String emailId;

	@NotNull
	@Size(min = 10)
	private String mobileNumber;

	@NotNull
	@Size(min = 8)
	@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}", message = "length should be 8 must contain atleast one uppercase, lowercase, special character and number")
	private String password;

	@Column(columnDefinition = "boolean default false")
	private boolean isVerified;

	@CreationTimestamp
	public LocalDateTime registeredAt;

	@UpdateTimestamp
	public LocalDateTime updatedAt;

	@Column(columnDefinition = "boolean default false")
	public boolean userStatus;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookId")
	private List<BookModel> books;	
	
	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private RoleType roleType;

	public UserModel(String fullName, String emailId, String mobileNumber, String password) {
		super();
		this.fullName = fullName;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}

}
