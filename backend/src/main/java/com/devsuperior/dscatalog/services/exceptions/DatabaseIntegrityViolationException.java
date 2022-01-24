package com.devsuperior.dscatalog.services.exceptions;

public class DatabaseIntegrityViolationException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DatabaseIntegrityViolationException(String msg) {
		super(msg);
	}

}
