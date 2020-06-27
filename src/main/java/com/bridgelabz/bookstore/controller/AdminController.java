package com.bridgelabz.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.bookstore.response.Response;
import com.bridgelabz.bookstore.service.AdminService;
import com.bridgelabz.bookstore.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	/*@Autowired
	UserService userService;

	@Autowired
	AdminService adminService;


	@GetMapping("/getBooksForVerification/{token}")
	public ResponseEntity<Response> getBooksForVerification(@PathVariable("token") String token) {

		if (adminService.getBooksForVerification(token).isEmpty()) {
			//return ResponseEntity.status(HttpStatus.OK).body(
				//	new Response( HttpStatus.OK.value(), adminService.getBooksForVerification(token)));
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(new Response(HttpStatus.NOT_FOUND.value(),"Book not found"));
	}

	@PutMapping("/bookVerification/{bookId}/{sellerId}")
	public ResponseEntity<Response> bookVerification(@PathVariable("bookId") Long bookId,
			@PathVariable("sellerId") Long sellerId) throws Exception {
		adminService.bookVerification(bookId, sellerId);
		return ResponseEntity.status(HttpStatus.OK).body(new Response(HttpStatus.OK.value(),"verfication is done"));
	}
*/}