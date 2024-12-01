package com.simplilearn;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class G_DynamicDemoTest {

	Calculator c;

	@BeforeEach
	void init() {
		c = new Calculator();
	}

	@TestFactory
	Collection<DynamicTest> dynamicTests() {

		Collection<DynamicTest> tests = new ArrayList<DynamicTest>();

		tests.add(DynamicTest.dynamicTest("Calculate when both inputs are positive",
				() -> Assertions.assertEquals(2, c.add(1, 1))));
		tests.add(DynamicTest.dynamicTest("Calculate when both inputs are negative",
				() -> Assertions.assertEquals(-2, c.add(-1, -1))));
		tests.add(DynamicTest.dynamicTest("Calculate when one input is negative and one is positive",
				() -> Assertions.assertEquals(0, c.add(-1, 1))));

		return tests;
	}
}
