package com.simplilearn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class F_DependencyInjection {

	@Test
	@DisplayName("Test")
	@Tag("my-tag")
	void test(TestInfo testInfo, TestReporter testReporter) {
		
		testReporter.publishEntry("Hello World"+ testInfo.getDisplayName());
	}
}
