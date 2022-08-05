package com.testng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Assert {
		@Test
		private void women() {
		String actual = "chudi";
		String expected ="chudi`";
Assert.assertEquals(actual,expected);
Assert.assertTrue(true);
Assert.assertFalse(false);
		
}
		