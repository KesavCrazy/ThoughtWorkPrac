package ThoughtWorks.SeleniumMarAir.testcase;

import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentTest;

import ThoughtWorks.SeleniumMarAir.Constant.HomePageConstants;
import ThoughtWorks.SeleniumMarAir.Constant.searchResult;
import ThoughtWorks.SeleniumMarAir.Utility.BaseClass;
/**
 * @author Kesavaraj Gopalakrishnan
 */

public class ScheduleNotPossible extends BaseClass{
	@Test
	
	
public void HomePageValidation() throws Exception{
		
		new HomePageConstants(driver, test).ReportLink();
		new HomePageConstants(driver, test).Departure("July");
		new HomePageConstants(driver, test).Return("1");
		new HomePageConstants(driver, test).Search();
		new searchResult(driver, test).NoSeatMessage("Unfortunately, this schedule is not possible. Please try again.");
	
}
}