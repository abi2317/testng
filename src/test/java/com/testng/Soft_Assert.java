package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
@Test
private void women() {
String actual = "chudi";
String expected ="chudi";
SoftAssert s = new SoftAssert();
s.assertEquals(actual,expected);


}
}
