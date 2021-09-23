package com.comcast.Contact;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "regrassion")
	public void creatContactTest()
	{
		System.out.println("contact created");
	}
	@Test(groups = "smoke")
	public void creatContactWithOrgnTest() {
		System.out.println("org contact");
	}

}
