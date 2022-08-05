package com.testng;

import org.testng.annotations.Test;

public class Group {
@Test(groups = "media")
private void whatsapp() {
System.out.println("whatsApp");
}
@Test(groups = "media")
private void telegram() {
System.out.println("Telegram");
}
@Test(groups = "ecomerce")
private void amazon() {
System.out.println("Amazon");
}
@Test(groups = "Ecommerce")
private void flipkart() {
System.out.println("Flipkart");
}
}
