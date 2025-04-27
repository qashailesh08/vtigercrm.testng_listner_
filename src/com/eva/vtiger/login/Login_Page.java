package com.eva.vtiger.login;

import com.eva.webutil.WebUtil;

public class Login_Page extends Login_Or {

	private WebUtil util;

	public Login_Page(WebUtil util) {
		super(util);
		this.util = util;
	}

	public void userCredential(String userName, String password, String selThemeByValue) {
		util.inputValue(getUserNameTB(), userName, "User Name TB");
		util.inputValue(getUserPasswordTB(), password, "Password TB");
		util.selectByValue(getColorThemeDD(), selThemeByValue, "Color Theme Dropdown");

	}

	public void loginButton() {
		util.click(getLoginBT(), "Login BT");
	}

}
