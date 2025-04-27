package com.eva.sales.sub_module.test_cases;

import org.testng.annotations.Test;

import com.eva.webutil.BaseTest;
import com.evs.app.reausablecode.VtigercommonCode;

public class leads_Creation extends BaseTest {

	@Test
	public void verifyCreateNewLeads() {
		VtigercommonCode vtObj=new VtigercommonCode(util);
		vtObj.gotoSalesLeads();
		vtObj.createPlusButton();
		
		
	}

}
