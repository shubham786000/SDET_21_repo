package com.comcast.orgtest.copy;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test(groups = "regrassion")
	public void creatOrgTest()
	{
		System.out.println("running creat org");
	}
	@Test(groups = "smoke")
	public void deleatOrgTest()
	{
		System.out.println("running deleat org");
	}
	@Test(groups = "regrassion")
	public void editOrgTest()
	{
		System.out.println("running edit org");
	}

}
