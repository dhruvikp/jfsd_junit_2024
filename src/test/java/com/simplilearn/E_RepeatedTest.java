package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class E_RepeatedTest {

	Calculator c;
	
	@BeforeEach
	void init() {
		c = new Calculator();
	}
	
	@Test
	@RepeatedTest(100)
	void calculate() {
		Assertions.assertEquals(2, c.add(1, 1));
	}
}
