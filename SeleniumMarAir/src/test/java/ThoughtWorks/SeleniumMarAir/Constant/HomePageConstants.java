package ThoughtWorks.SeleniumMarAir.Constant;
import java.time.Duration;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import ThoughtWorks.SeleniumMarAir.testcase.HomePage;

public class HomePageConstants {
	WebDriver driver;
	ExtentTest test;
	ExtentColor Color;
	public static Logger log = LogManager.getLogger(HomePageConstants.class.getName());
			
	public HomePageConstants (WebDriver driver, ExtentTest test){
		
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[@id=\"report_issue\"]")
	WebElement reportIssue;
	@FindBy(xpath="//select[@id='departing']")
	WebElement departField;
	@FindBy(xpath="//select[@id='returning']")
	WebElement returnField;
	@FindBy(css="input[value='Search']")
	WebElement searchButton;


public void ReportLink()
{
	try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement reportAnIssue = wait.until(ExpectedConditions.visibilityOf(reportIssue));
        System.out.println(reportAnIssue.getText());
        Assert.assertTrue(reportAnIssue.getText().contains("Report an issue"));
        Assert.assertTrue(reportAnIssue.getText().contains("Problem definition"));
        Assert.assertTrue(reportAnIssue.getText().contains("Privacy Policy"));
	//log.debug("UserName : Entered");
	//test.log(Status.PASS, MarkupHelper.createLabel("UserName : Entered", ExtentColor.GREEN));
	}
	catch(Exception e){
		//test.log(Status.PASS, MarkupHelper.createLabel("UserName Not Entered", ExtentColor.RED));
//		throw e;
	}
}

public void Departure(String month)
{
	try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement departureDropdown = wait.until(ExpectedConditions.visibilityOf(departField));
        Select dropdown = new Select(departureDropdown);
        dropdown.selectByVisibleText(month);
	}
	catch(Exception e){
		throw e;
	}
}
public void Return(String value)
{
	try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement returnDropdown = wait.until(ExpectedConditions.visibilityOf(returnField));
        Select dropdown = new Select(returnDropdown);
        dropdown.selectByValue(value);
	}
	catch(Exception e){
		throw e;
	}
}
public void Search()
{
	try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchButtonClick = wait.until(ExpectedConditions.visibilityOf(searchButton));
        searchButtonClick.click();
	}
	catch(Exception e){
		throw e;
	}
}

}
