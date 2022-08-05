package com.testng;

import org.testng.annotations.Test;

public class Ignore {
	@org.testng.annotations.Ignore
@Test
private void watch() {
System.out.println("Watch");
}
@Test
private void dress() {
System.out.println("Dress");
}
@Test(enabled = false)
private void slipper() {
System.out.println("slipper");
}
}
