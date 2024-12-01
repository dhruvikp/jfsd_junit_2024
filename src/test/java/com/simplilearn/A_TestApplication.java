package com.simplilearn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class A_TestApplication {

	@BeforeAll
	static void initAll() {
		System.out.println("Before All method invoked..");
	}

	@BeforeEach
	void init() {
		System.out.println("Before ech init() invoked");
	}

	@Test
	void test1() {
		System.out.println("Testing code test1() method");
	}

	@Test
	void test2() {
		System.out.println("Testing code test2() method");
	}

	@AfterEach
	void destroy() {
		System.out.println("After each destroy() method invoked..");
	}

	@AfterAll
	static void tearDownAll() {
		System.out.println("After all method invoked..");
	}
}
