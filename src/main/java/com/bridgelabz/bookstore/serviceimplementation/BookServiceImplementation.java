package com.bridgelabz.bookstore.serviceimplementation;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.bridgelabz.bookstore.dto.BookDto;
import com.bridgelabz.bookstore.exception.UserException;
import com.bridgelabz.bookstore.model.BookModel;
import com.bridgelabz.bookstore.repository.BookRepository;
import com.bridgelabz.bookstore.repository.UserRepository;
import com.bridgelabz.bookstore.response.Response;
import com.bridgelabz.bookstore.service.BookService;
import com.bridgelabz.bookstore.utility.JwtGenerator;

@Service
public class BookServiceImplementation implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Response addBook(BookDto bookDto,String token) {
		
		long id = JwtGenerator.decodeJWT(token);
		String role = userRepository.checkRole(id);
		if(role.equals("SELLER")){
		BookModel book = new BookModel();
		BeanUtils.copyProperties(bookDto, book);
		book.setVerfied(false);
		book.setUpdatedDateAndTime(LocalDateTime.now());
		book.setCreatedDateAndTime(LocalDateTime.now());
		book.isVerfied();
		bookRepository.save(book);
		return new Response(HttpStatus.OK.value(),"Book Added Successfully Need to Verify");
	     
	}
	 return new Response(HttpStatus.OK.value(),"Book Not Added Becoz Not Authoriized to add Book");
	}
	
	@Override
	public Response updateBook(BookDto bookDto, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response deleteBook(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
