package com.example.apirabbitmqysmarksreceive.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.apirabbitmqysmarksreceive.config.ClientConfiguration;
import com.example.apirabbitmqysmarksreceive.domain.Post;
import com.example.apirabbitmqysmarksreceive.hystrix.JSONPlaceHolderFallback;

@FeignClient(url = "https://jsonplaceholder.typicode.com/", value = "jplaceholde", configuration = ClientConfiguration.class, fallback = JSONPlaceHolderFallback.class)
public interface JSONPlaceHolderClient {
	
	@GetMapping("/posts")
	List<Post> getPOsts();
	
	@GetMapping("/posts/{postId}")
	Post getPostById(@PathVariable("postId") Long id);
	

}
