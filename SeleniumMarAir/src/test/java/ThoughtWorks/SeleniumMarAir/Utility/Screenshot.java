package ThoughtWorks.SeleniumMarAir.Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static String getScreenShot(WebDriver driver) {
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File tempScreenshot = screenShot.getScreenshotAs(OutputType.FILE);
		String destFileFolder = "C:\\Users\\ELCOT\\Downloads\\Selenium Screenshot";
		String destFileName = DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.now()).replaceAll(":", "_");
		String destFileExten = destFileName+".png";
		File dest = new File (destFileFolder+"\\"+destFileExten);
		try {
			Files.copy(tempScreenshot, dest);
		}
		catch(IOException e) {
			System.out.println("Capture Failed :" + e.getMessage());
		}
		
		return destFileFolder+"\\"+destFileExten;
		
	}
}