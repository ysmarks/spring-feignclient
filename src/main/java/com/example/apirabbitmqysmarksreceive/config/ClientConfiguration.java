package com.example.apirabbitmqysmarksreceive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;
import feign.okhttp.OkHttpClient;

@Configuration
public class ClientConfiguration {
	
	@Bean
	public Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
				
	}
	
	@Bean
	public ErrorDecoder errorDecode() {
		return new ErrorDecoder.Default();
	}
	
	@Bean
	public OkHttpClient client() {
		return new OkHttpClient();
	}
	
	@Bean
	public RequestInterceptor requestIntercepdtor() {
		return requestTemplate -> {
			requestTemplate.header("user", "ajeje");
			requestTemplate.header("password", "brazof");
		};
	}
}
