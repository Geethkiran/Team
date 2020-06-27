package com.bridgelabz.bookstore.service;

import java.util.List;

import com.bridgelabz.bookstore.model.BookModel;

public interface AdminService {

	List<BookModel> getBooksForVerification(String token);

	void bookVerification(Long bookId, Long sellerId);

}
