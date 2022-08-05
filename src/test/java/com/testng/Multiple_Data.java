package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Multiple_Data {
@Test (dataProvider = "details")
private void credenital( String name,String password) {
System.out.println("username:"+name);
System.out.println("userpassword:"+password);
}
@DataProvider
private Object[][] details() {
return new Object[][] {{"abi","abi@124"},{"abi","abi@124"}};
}
}
