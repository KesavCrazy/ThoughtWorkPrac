package ThoughtWorks.SeleniumMarAir.Utility;
import ThoughtWorks.SeleniumMarAir.Utility.*;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
/**
 * @author Kesavaraj Gopalakrishnan
 */

public class BaseClass {
public WebDriver driver;
public ExtentReports report;
public ExtentTest test;

@BeforeClass

public void LaunchSite()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver-win32\\chromedriver.exe");
	report = ExtentFac.getInstance();
	driver = new ChromeDriver();
	driver.get("https://marsair.recruiting.thoughtworks.net/kesavgk1999@gmail.com");
	driver.manage().window().maximize();
}
@AfterMethod
public void teardown(ITestResult result) throws IOException {
	if(result.getStatus()==ITestResult.FAILURE)
	{
	String temp = Screenshot.getScreenShot(driver);
	}
	report.flush();
}

@AfterClass

public void Close() {
	driver.quit();
	report.flush();
}

}