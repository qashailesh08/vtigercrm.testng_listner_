package com.eva.sales.sub_module.reusable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.eva.webutil.WebUtil;
import lombok.Getter;

@Getter
public class Sales_Leads_Detail_Or {

	public Sales_Leads_Detail_Or(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);

	}

	@FindBy(name = "salutationtype")
	private WebElement firstNameDD;

	@FindBy(name = "firstname")
	private WebElement firstNameTB;

	@FindBy(name = "lastname")
	private WebElement lastNameTB;

	@FindBy(name = "company")
	private WebElement companyTB;

	@FindBy(id = "designation")
	private WebElement titleTB;

	@FindBy(name = "leadsource")
	private WebElement leadsSourceDD;

	@FindBy(name = "leadstatus")
	private WebElement leadsStatusDD;

}
