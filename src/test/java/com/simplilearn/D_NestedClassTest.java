package com.simplilearn;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class D_NestedClassTest {

	@Nested
	class A {
		
		@Test
		void sampleTest() {
			System.out.println("Example test for method A");
		}
	}
}
