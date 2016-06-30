package com.german.restapivalidation.daos;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Book {

	@NotNull 
	@Min(1000000000000l)
	 private  long isbn;
	
	@NotNull 
	 private  String title;
	
	@NotNull 
	@Max(9999)
	 private  int year;
	
	private List<String> images;

	public long getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	} 
	 
}
