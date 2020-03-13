package com.example.apirabbitmqysmarksreceive.exception;

public class BadRequestException extends Exception {

	public BadRequestException() {}

	public BadRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public BadRequestException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public BadRequestException(String message) {
		super(message);
		
	}

	public BadRequestException(Throwable cause) {
		super(cause);

	}
	
	

}
