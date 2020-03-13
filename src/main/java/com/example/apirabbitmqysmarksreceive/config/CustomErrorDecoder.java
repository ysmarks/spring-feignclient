package com.example.apirabbitmqysmarksreceive.config;

import com.example.apirabbitmqysmarksreceive.exception.BadRequestException;
import com.example.apirabbitmqysmarksreceive.exception.NotFoundException;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {
		
		switch (response.status()) {
		
		case 400:
			return new BadRequestException();
			
		case 404:
			return new NotFoundException();
			
		default:
			return new Exception("Generic error");
		}
	}

}
