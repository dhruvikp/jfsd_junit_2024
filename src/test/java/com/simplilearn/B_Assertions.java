package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class B_Assertions {

	@Test
	public void test() {
		String str = null;
		String str2 = "some value";

		String[] a1 = { "A", "B" };
		String[] a2 = { "A", "B" };
		
		Assertions.assertTrue(4>0);
		Assertions.assertNull(str);
		Assertions.assertNotNull(str2);
		
		Assertions.assertSame(str2, str2);
		Assertions.assertArrayEquals(a1, a2);

	}

}
