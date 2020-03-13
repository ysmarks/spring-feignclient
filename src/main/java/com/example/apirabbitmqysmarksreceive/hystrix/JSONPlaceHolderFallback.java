package com.example.apirabbitmqysmarksreceive.hystrix;

import java.util.Collections;
import java.util.List;

import com.example.apirabbitmqysmarksreceive.domain.Post;
import com.example.apirabbitmqysmarksreceive.service.JSONPlaceHolderClient;

public class JSONPlaceHolderFallback implements JSONPlaceHolderClient {

	@Override
	public List<Post> getPOsts() {
		return Collections.emptyList();
	}

	@Override
	public Post getPostById(Long id) {
		return null;
	}

}
