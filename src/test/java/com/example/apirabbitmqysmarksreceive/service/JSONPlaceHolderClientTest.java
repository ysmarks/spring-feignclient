package com.example.apirabbitmqysmarksreceive.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.apirabbitmqysmarksreceive.domain.Post;

@RunWith(SpringRunner.class)
@SpringBootTest
class JSONPlaceHolderClientTest {

	@Autowired
	private JSONPlaceHolderService service;
	
	@Test
	void test1() {
		List<Post> posts = service.getPosts();
		assertFalse(posts.isEmpty());
	}
	
	@Test
	void test2() {
		Post post = service.getPostById(2l);
		assertNotNull(post);
		System.out.println("TESTE " + post);
	}

}
