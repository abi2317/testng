package com.testng;

import org.testng.annotations.Test;

public class Incovation_Count {
@Test
private void women() {
System.out.println("WOMEN");
}
@Test
private void dress() {
System.out.println("Dress");
}
@Test(invocationCount = 2)
private void vegetables() {
System.out.println("Vegetable");
}
}
