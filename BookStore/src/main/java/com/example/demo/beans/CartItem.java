package com.example.demo.beans;

import java.io.Serializable;

public class CartItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String bookID;
	private int bookQuantity;
	
	
	
	
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
		bookID = null;
		bookQuantity = 0;
	}
	public CartItem(String bookID, int bookQuantity) {
		super();
		this.bookID = bookID;
		this.bookQuantity = bookQuantity;
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public int getBookQuantity() {
		return bookQuantity;
	}
	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}
	
}