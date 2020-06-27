package com.bridgelabz.bookstore.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.bookstore.model.BookModel;
import com.bridgelabz.bookstore.repository.BookRepository;
import com.bridgelabz.bookstore.repository.UserRepository;
import com.bridgelabz.bookstore.service.AdminService;
import com.bridgelabz.bookstore.utility.JwtGenerator;

public class AdminServiceImplementation implements AdminService{

	@Override
	public List<BookModel> getBooksForVerification(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void bookVerification(Long bookId, Long sellerId) {
		// TODO Auto-generated method stub
		
	}
/*
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookRepository bookRepository;	
	@Override
	public List<BookModel>  getBooksForVerification(String token) {
		
		long id = JwtGenerator.decodeJWT(token);
		String role = userRepository.checkRole(id);
		if(role.equals("ADMIN")){
			List<BookModel> allBooks = bookRepository.findAll();
			List<BookModel> unverifiedBooks;
			for(int i=0;i<allBooks.size();i++) {
				//if (a)
				
			}
								
		return allBooks;
		}
		// TODO Auto-generated method stub
		return null;
	
	}
	
	
	@Override
	public void bookVerification(Long bookId, Long sellerId) {
		// TODO Auto-generated method stub
		
	}
*/
}
