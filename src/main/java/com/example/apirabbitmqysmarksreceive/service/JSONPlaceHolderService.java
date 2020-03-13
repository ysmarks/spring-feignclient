package com.example.apirabbitmqysmarksreceive.service;

import java.util.List;

import com.example.apirabbitmqysmarksreceive.domain.Post;

public interface JSONPlaceHolderService {

	List<Post> getPosts();
	
	Post getPostById(Long id);
}
