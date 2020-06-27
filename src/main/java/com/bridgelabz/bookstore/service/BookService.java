package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.BookDto;
import com.bridgelabz.bookstore.response.Response;

public interface BookService {

	Response addBook(BookDto bookDto,String token);
	Response updateBook(BookDto bookDto,Long id);
	Response deleteBook(Long id);
	//Response getAllBooks();
	//Response getUnVerfiedBooks();
}
