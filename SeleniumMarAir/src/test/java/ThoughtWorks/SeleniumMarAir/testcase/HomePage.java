package ThoughtWorks.SeleniumMarAir.testcase;

import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentTest;

import ThoughtWorks.SeleniumMarAir.Constant.HomePageConstants;
import ThoughtWorks.SeleniumMarAir.Constant.searchResult;
import ThoughtWorks.SeleniumMarAir.Utility.BaseClass;
/**
 * @author Kesavaraj Gopalakrishnan
 */

public class HomePage extends BaseClass{
	@Test
	
	
public void HomePageValidation() throws Exception{
		
		new HomePageConstants(driver, test).ReportLink();
		new HomePageConstants(driver, test).Departure();
		new HomePageConstants(driver, test).Return();
		new HomePageConstants(driver, test).Search();
		new searchResult(driver, test).NoSeatMessage();
	
}
}