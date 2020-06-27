package com.bridgelabz.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.bookstore.dto.BookDto;
import com.bridgelabz.bookstore.exception.UserException;
import com.bridgelabz.bookstore.response.Response;
import com.bridgelabz.bookstore.service.BookService;
import com.bridgelabz.bookstore.serviceimplementation.BookServiceImplementation;

@RestController
@RequestMapping("/book")
public class BookController {


	@Autowired
	private BookServiceImplementation bookService;
	
	@PostMapping(value = "/addBook", headers = "Accept=application/json")
	public ResponseEntity<Response> addBook(@RequestBody BookDto bookDto, @RequestHeader("token") String token)
			throws UserException {
		Response addedbook = bookService.addBook(bookDto, token);
		return new ResponseEntity<Response>(addedbook, HttpStatus.OK);
	}

	
}
