package com.evs.data.provider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.eva.vtiger.login.Login_Page;
import com.eva.webutil.BaseTest;

public class DataProviderParrelleExicution extends BaseTest {
	@Parameters({ "username", "password", "colortheme" })
	@Test
	public void validLogin(String username, String password, String colortheme) {
		Login_Page logObj = new Login_Page(util);
		logObj.userloginCredential(username, password, colortheme);
		util.verifyFirstSelectedOption(logObj.getColorThemeDD(), "woodspice", "Color Theme Dropdown");
		logObj.loginButton();
	}

	@Parameters({ "username", "password", "colortheme" })
	@Test
	public void inValidUserName(String username, String password, String colortheme) {
		Login_Page logObj = new Login_Page(util);
		logObj.userloginCredential(username, password, colortheme);
		util.verifyFirstSelectedOption(logObj.getColorThemeDD(), "bluelagoon", "Color Theme Dropdown");
		logObj.loginButton();
		util.getPageSource("You must specify a valid username and password.");
	}

	@Parameters({ "username", "password", "colortheme" })
	@Test
	public void inValidPassword(String username, String password, String colortheme) {
		Login_Page logObj = new Login_Page(util);
		logObj.userloginCredential(username, password, colortheme);
		util.verifyFirstSelectedOption(logObj.getColorThemeDD(), "softed", "Color Theme Dropdown");
		logObj.loginButton();
		util.getPageSource("You must specify a valid username and password.");
	}

	@Parameters({ "username", "password", "colortheme" })
	@Test
	public void emptyLogin(String username, String password, String colortheme) {
		Login_Page logObj = new Login_Page(util);
		logObj.userloginCredential(username, password, colortheme);
		util.verifyFirstSelectedOption(logObj.getColorThemeDD(), "softed", "Color Theme Dropdown");
		logObj.loginButton();
		util.getPageSource("You must specify a valid username and password.");
	}

}
