package com.german.restapivalidation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.german.restapivalidation.daos.Book;
@Component
public class BookService {
	
	ArrayList<Book> books;
	
	BookService(){
		
		books= new ArrayList<Book>();	
		Book b=new Book();
		b.setIsbn(123143424224424242L);
		b.setTitle("Jauncito y la pepa loca");
		b.setYear(1223);
		List<String> images= new ArrayList<String>();
		images.add("http://pngimg.com/upload/small/book_PNG2122.png");
		images.add("http://pngimg.com/upload/small/book_PNG2121.png");
		b.setImages(images);
		books.add(b);
	}
	

	
	void addBook(Book book){
		books.add(book);
	}
	
	void removeBook(Book bookToDelete){
		
		
		for (Book book : books) {
			if (book.getIsbn()== bookToDelete.getIsbn()){
				bookToDelete=book;
			}
		}
		
		books.remove(bookToDelete);
		
	}



	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
}
