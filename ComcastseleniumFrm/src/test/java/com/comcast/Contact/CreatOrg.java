package com.comcast.Contact;

import org.testng.annotations.Test;

public class CreatOrg {
	@Test(groups = "regrassion")
	public void creatOrgTest()
	{
		System.out.println("Org created");
	}
	@Test(groups = "regrassion")
	public void modifyOrgTest() {
		System.out.println("Org modify");
	}
	@Test(groups = "smoke")
	public void deleatOrgTest()
	{
		System.out.println("Org deleated");
	}
}
