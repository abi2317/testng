package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrized {
@Test
@Parameters({"username,password"})
private void credenital(@Optional String name,String password) {
System.out.println("username:"+name);
System.out.println("userpassword:"+password);
}
}