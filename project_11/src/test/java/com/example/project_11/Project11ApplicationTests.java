package com.example.project_11;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Project11ApplicationTests {

	@Test
	void contextLoads() {
	}

	@BeforeAll
	static void initAll() {
		System.out.println("BeforeAll invoked");
	}

	@BeforeEach
	void initMe() {
		System.out.println("Before Each init()");
	}

	@Test
	void success() {
		System.out.println("This is your actual test case logic");
	}

	@AfterEach
	void afterEach() {
		System.out.println("AfterEach method invoked");
	}

	@AfterAll
	static void destroyAll() {
		System.out.println("AfterAll invoked");
	}

}
