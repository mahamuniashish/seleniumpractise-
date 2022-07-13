package screenshotStudy;

import java.io.File;
import java.util.logging.FileHandler;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenShotEx1 {

	public static void main(String[] args) throws IOException,InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Automation\\\\ChromeDriver\\\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("F:\\Automation\\ScreenShot");
		
		
		
		
		

	}

}
