package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Simple_Annotation {
@BeforeSuite
private void browser() {
System.out.println("Browser");
}
@BeforeClass
private void url() {
System.out.println("URL");
}
@BeforeMethod
private void signin() {
System.out.println("Signin");
}
@Test
private void women() {
System.out.println("Women");
}
@Test
private void dress() {
	System.out.println("Dress");
}
@AfterMethod
private void signout() {
System.out.println("Signout");
}
@AfterClass
private void close() {
System.out.println("Close");
}
@AfterSuite
private void deletecookies() {
System.out.println("Delete cookies");
}
}




