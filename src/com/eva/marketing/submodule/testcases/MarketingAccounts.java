package com.eva.marketing.submodule.testcases;

import org.testng.annotations.Test;

import com.eva.marketing.sub_module.reusable.code.AccountsDetailesPage;
import com.eva.marketing.sub_module.reusable.code.Campaign_Detailes_Page;
import com.eva.marketing.sub_module.reusable.code.Leads_Detailes_Page;
import com.eva.testng.listner.RetryFailedTestCases;
import com.eva.webutil.BaseTest;
import com.eva.webutil.WebUtil;
import com.evs.app.reausablecode.VtigercommonCode;

public class MarketingAccounts extends BaseTest {

	@Test
	public void verifyCreateNewAccount() {

		VtigercommonCode vtObj = new VtigercommonCode(util);
		AccountsDetailesPage accObj = new AccountsDetailesPage(util);
		vtObj.mouseOverOnMarketing();
		util.verifyIsEnabled(vtObj.getMarkAccounts_Sub_ModuleLT(), true, "Marketing Account Link");
		vtObj.gotoMarkAccount();
		util.verifyIsEnabled(vtObj.getCreatePlusBT(), true, "Create Plus Button");
		vtObj.createPlusButton();
		accObj.accountName("Anshu Maury");
		util.verifyAttribute(accObj.getAccountNameTB(), "Anshu Maury", "value", "Account Name");
		accObj.phone("8354938456");
		util.verifyAttribute(accObj.getPhoneTB(), "8354938456", "value", "Phone");
		accObj.fax("Yahoo");
		util.verifyAttribute(accObj.getFaxTB(), "Yahoo", "value", "Fax");
		accObj.email("riya9263@gmail.com");
		util.verifyAttribute(accObj.getEmailTB(), "riya9263@gmail.com", "value", "Email");
		accObj.billAddress("Bhadohi, Mondh , Utter Pradesh");
		util.verifyAttribute(accObj.getBillAddressTB(), "Bhadohi, Mondh , Utter Pradesh", "value", "Billing Address");
		accObj.billCity("Bhadohi");
		util.verifyAttribute(accObj.getBillCityTB(), "Bhadohi", "value", "Billing City");
		accObj.billState("Utter Pradesh");
		util.verifyAttribute(accObj.getBillStateTB(), "Utter Pradesh", "value", "Billing State");
		accObj.billCountry("India");
		util.verifyAttribute(accObj.getBillCountryTB(), "India", "value", "Billing Country");
		accObj.billPostoleCode("221401");
		util.verifyAttribute(accObj.getBillPostoleCodeTB(), "221401", "value", "Billing Postole Code");
		accObj.copyBillingAddress();
//		util.verifyAttribute(accObj.getAccountNameTB(), "Riya", "value", "Account Name");
//		util.verifyAttribute(accObj.getPhoneTB(), "8354938456", "value", "Phone");
//		util.verifyAttribute(accObj.getFaxTB(), "Yahoo", "value", "Fax");
//		util.verifyAttribute(accObj.getEmailTB(), "riya9263@gmail.com", "value", "Email");
//		util.verifyAttribute(accObj.getBillAddressTB(), "Bhadohi, Mondh , Utter Pradesh", "value", "Billing Address");
//		util.verifyAttribute(accObj.getBillCityTB(), "Bhadohi", "value", "Billing City");
//		util.verifyAttribute(accObj.getBillStateTB(), "Utter Pradesh", "value", "Billing State");
//		util.verifyAttribute(accObj.getBillCountryTB(), "India", "value", "Billing Country");
//		util.verifyAttribute(accObj.getBillPostoleCodeTB(), "221401", "value", "Billing Postole Code");
		util.verifyAttribute(accObj.getShippAddressTB(), "Bhadohi, Mondh , Utter Pradesh", "value", "Shipping Address");
		util.verifyAttribute(accObj.getShippCityTB(), "Bhadohi", "value", "Shipping City");
		util.verifyAttribute(accObj.getShippStateTB(), "Utter Pradesh", "value", "Shipping State");
		util.verifyAttribute(accObj.getShippCountryTB(), "India", "value", "Shipping Country");
		util.verifyAttribute(accObj.getShippPostoleCodeTB(), "221401", "value", "Shipping Postole Code");
//		vtObj.formLowerSaveButton();
//		util.verifyIsEnabled(vtObj.getUpperEditBT(), true, "Account Upper Edit Button");
//		util.verifyInnerText(accObj.getAccNoIT(), " ACC150", "Accounts No");

	}

	@Test
	public void verifyAccountDelete() {
		WebUtil util = WebUtil.getInstance();
		VtigercommonCode vtObj = new VtigercommonCode(util);
		vtObj.mouseOverOnMarketing();
		vtObj.gotoMarkAccount();
		vtObj.deleleSub_Module_Table_Information("Riya", "accountname", "Accounts Sub_Module");
		util.verifyIsEnabled(vtObj.getMarkAccounts_Sub_ModuleLT(), true, "Marketing Account Link");
	}

}
