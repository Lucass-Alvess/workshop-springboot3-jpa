package com.lucasweb.demo.services.exception;

public class DatabaseExeption extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public DatabaseExeption(String msg) {
		super(msg);
	}

}
