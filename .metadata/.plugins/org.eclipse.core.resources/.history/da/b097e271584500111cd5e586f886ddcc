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

public class searchResult {
	WebDriver driver;
	ExtentTest test;
	ExtentColor Color;
	public static Logger log = LogManager.getLogger(searchResult.class.getName());
			
	public searchResult (WebDriver driver, ExtentTest test){
		
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[@id=\"content\"]")
	WebElement noSeatMsg;

public void NoSeatMessage(String outputMessage)
{
	try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement noSeatMessage = wait.until(ExpectedConditions.visibilityOf(noSeatMsg));
        Assert.assertTrue(noSeatMessage.getText().contains(outputMessage));
        System.out.println(outputMessage);
	//log.debug("UserName : Entered");
	//test.log(Status.PASS, MarkupHelper.createLabel("UserName : Entered", ExtentColor.GREEN));
	}
	catch(Exception e){
		//test.log(Status.PASS, MarkupHelper.createLabel("UserName Not Entered", ExtentColor.RED));		
		throw e;
	}
}
}
