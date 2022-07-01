package com.lko.first.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.lko.first.FirstApplication;

@SpringBootTest(classes = FirstApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {
	
	@Autowired
    private TestRestTemplate template;

	@Test
	void test() {
		ResponseEntity<String> response = template.getForEntity("/hello", String.class);
        assertThat(response.getBody()).isEqualTo("Hello World, Spring Boot!");
	}

}
