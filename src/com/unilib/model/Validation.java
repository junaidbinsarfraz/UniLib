package com.unilib.model;

import java.io.Serializable;

import com.unilib.dao.Book;

public class Validation implements Serializable {
	
	public Integer status; // 404 - not found, 200 - Ok, 403 forbidden
	public String statusMessage;
	public String bookTitle;
	public String bookAuthor;
	public String publisher;
	
}
