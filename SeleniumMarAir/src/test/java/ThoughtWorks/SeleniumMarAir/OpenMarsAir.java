package ThoughtWorks.SeleniumMarAir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class OpenMarsAir{

static WebDriver driver = new ChromeDriver();
static WebDriverWait wait = new WebDriverWait(driver, null, null);

public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver-win32\\chromedriver.exe");
	driver.get("https://marsair.recruiting.thoughtworks.net/kesavgk1999@gmail.com");
	driver.manage().window().maximize();
	List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\"report_issue\"]"));
	for (WebElement element : elements) {
        System.out.println(element.getText());
		Assert.assertTrue(element.getText().contains("Report an issue"));
        Assert.assertTrue(element.getText().contains("Problem definition"));
        Assert.assertTrue(element.getText().contains("Privacy Policy"));
	}
}
}