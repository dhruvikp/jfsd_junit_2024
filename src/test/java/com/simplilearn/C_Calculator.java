package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;

@RunWith(JUnitPlatform.class)
@DisplayName("Calculator test")
public class C_Calculator {
	Calculator c;
	
	@BeforeEach
	public void init() {
		c = new Calculator();
	}
	
	@Test
	@DisplayName("Test addition when both inputs are positive")
	void testAddition_when_both_positive() {
	
		// Step 1: prepare input
		int a = 1;
		int b = 1;
		
		// STEP 2: invoke method to get actual return value
		int actual = c.add(a, b);
		
		// STEP 3: Assert
		Assertions.assertEquals(2, actual);
	}
	
	@Test
	@DisplayName("Test Addition when both inputs are negative")
	void testAddition_when_both_negative() {
	
		// Step 1: prepare input
		int a = -1;
		int b = -1;
		
		// STEP 2: invoke method to get actual return value
		int actual = c.add(a, b);
		
		// STEP 3: Assert
		Assertions.assertEquals(-2, actual);
	}
	
	
}
