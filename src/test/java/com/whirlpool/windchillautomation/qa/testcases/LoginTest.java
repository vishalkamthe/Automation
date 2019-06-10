package com.whirlpool.windchillautomation.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.whirlpool.windchillautomation.qa.base.DriverInitialization;
import com.whirlpool.windchillautomation.qa.pages.WCHomePage;

public class LoginTest extends DriverInitialization {

	WCHomePage homepage;

	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setup() throws IOException
	{
		driverInitialization();
		homepage = new WCHomePage();

	}


	@Test
	public void NaviagateToFolderPage() throws IOException
	{
		homepage.navigateToWCFoldersPage();
	}


}
