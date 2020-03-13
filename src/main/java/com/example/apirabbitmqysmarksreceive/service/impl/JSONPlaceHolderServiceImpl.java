package com.example.apirabbitmqysmarksreceive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apirabbitmqysmarksreceive.domain.Post;
import com.example.apirabbitmqysmarksreceive.service.JSONPlaceHolderClient;
import com.example.apirabbitmqysmarksreceive.service.JSONPlaceHolderService;

@Service
public class JSONPlaceHolderServiceImpl implements JSONPlaceHolderService {

	@Autowired
	private JSONPlaceHolderClient client;
	
	@Override
	public List<Post> getPosts() {
		
		return client.getPOsts();
	}

	@Override
	public Post getPostById(Long id) {
	
		return client.getPostById(id);
	}

}
