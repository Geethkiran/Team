package com.bridgelabz.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.bookstore.exception.UserNotFoundException;
import com.bridgelabz.bookstore.model.BookModel;
import com.bridgelabz.bookstore.response.Response;
import com.bridgelabz.bookstore.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;

	@GetMapping("/getBooksForVerification/{token}")
	public List<BookModel> getBooksForVerification(@PathVariable("token") String token) throws UserNotFoundException {
		return adminService.getBooksForVerification(token);
	}

	@PutMapping("/bookVerification/{bookId}/{sellerId}/{token}")
	public ResponseEntity<Response> bookVerification(@PathVariable("bookId") Long bookId,
			@PathVariable("sellerId") Long sellerId, @PathVariable("token") String token) throws Exception {
		adminService.bookVerification(bookId, sellerId,token);
		return ResponseEntity.status(HttpStatus.OK).body(new Response(HttpStatus.OK.value(),"verfication is done"));
	}
}