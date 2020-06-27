package com.bridgelabz.bookstore.service;

import java.util.List;

import com.bridgelabz.bookstore.exception.UserNotFoundException;
import com.bridgelabz.bookstore.model.BookModel;

public interface AdminService {

	List<BookModel> getBooksForVerification(String token) throws UserNotFoundException;

	void bookVerification(Long bookId, Long sellerId,String token);

}
