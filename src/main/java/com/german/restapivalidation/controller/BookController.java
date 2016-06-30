package com.german.restapivalidation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.german.restapivalidation.daos.Book;

@RestController

@RequestMapping(value = "/books")
public class BookController {
	
	 @Autowired
	BookService bookService;
	
	
	 //`@Valid` tells Spring to validate the “Subscriber” object
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Book> addBook(@RequestBody @Valid Book book, BindingResult result) {
		
		if(result.hasErrors()){
			return new ResponseEntity<Book>(HttpStatus.NOT_ACCEPTABLE);
		}
		
		 bookService.addBook(book);
		 return new ResponseEntity<Book>(HttpStatus.OK);
	}
	
	

	@RequestMapping( method = RequestMethod.GET, produces="application/json")
	public List<Book> getBooks() {	return bookService.getBooks(); 	}
	
	 
}
