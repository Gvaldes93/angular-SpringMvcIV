package com.german.restapivalidation.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.german.restapivalidation.daos.Book;

@RestController
public class Controller {

	private static final String template = " Helllo, %s!";
	private final AtomicLong counter = new AtomicLong();
	List<Book> colGreeting = new ArrayList<Book>();
	/*
	// Create Greeting  
	@RequestMapping(value = "/saveGreeting", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Book> saveGreeting(@RequestParam(value = "name", defaultValue = "World") String name) {

		Book g = new Book(counter.incrementAndGet(), String.format(template, name));
		
		colGreeting.add(g);
		
		return new ResponseEntity<Book>(g, HttpStatus.OK);
	}
	

	//Create Greeting with POST method
	@RequestMapping(value="/newGreeting", method = RequestMethod.POST, produces="application/json")
	public ResponseEntity<Book> newGreeting(@RequestBody Book greeting) {
		
		 colGreeting.add(greeting);
		
		return new ResponseEntity<Book>( HttpStatus.OK);
	}
	

	// Delete Greeting by ID
	@RequestMapping(value = "/greetingRemove/{id}", produces = "application/json")
	public ResponseEntity<List<Book>> greetingRemove(@PathVariable("id") Long id) {
		
		Book greetingToRemove = null;
		
		if (id != null) {
			for (Book greeting : colGreeting) {
				if (greeting.getId() == id) {
					greetingToRemove = greeting;
				}
			}
			
			if (greetingToRemove != null) {
				colGreeting.remove(greetingToRemove);
				return new ResponseEntity<List<Book>>(HttpStatus.OK);
			}
		}
		return  new ResponseEntity<List<Book>>(HttpStatus.OK);
	
	}
	
	
	@RequestMapping(value = "/updateGreeting/{id}/{name}",   produces="aplication/json")
	public ResponseEntity<Book> updateEmployee(@PathVariable("id") int id, @PathVariable("name") String name){
		
		Book greetingToUpdate=null;
		
		for (Book greetingInCollection : colGreeting) {
			if(id==greetingInCollection.getId()){
				greetingToUpdate=greetingInCollection;
			}
		}
		
		colGreeting.remove(greetingToUpdate);
		Book greetingNew=new Book(id, name);
		colGreeting.add(greetingNew);
		
	    return new ResponseEntity<Book>(greetingNew, HttpStatus.OK);
	}
	
	
	// get all the greetings
	@RequestMapping(value = "/getGreetings", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Book>> getColGreetings() {
		
		if(colGreeting.isEmpty()){
			
			return new ResponseEntity<List<Book>>(HttpStatus.NO_CONTENT);
			
		}
		
		return new ResponseEntity<List<Book>>(colGreeting, HttpStatus.OK);
	}
		*/
	
}
