package com.greedy.section03.setterinjection.javaconfig;

import java.util.Date;

public class BookDTO {

	private int sequece;
	private int isbn;
	private String title;
	private String author;
	private String publisher;
	private Date createdDate;
	
	public BookDTO() {}

	public BookDTO(int sequece, int isbn, String title, String author, String publisher, Date createdDate) {
		super();
		this.sequece = sequece;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.createdDate = createdDate;
	}

	public int getSequece() {
		return sequece;
	}

	public void setSequece(int sequece) {
		this.sequece = sequece;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "BookDTO [sequece=" + sequece + ", isbn=" + isbn + ", title=" + title + ", author=" + author
				+ ", publisher=" + publisher + ", createdDate=" + createdDate + "]";
	}
	
	
	
}
