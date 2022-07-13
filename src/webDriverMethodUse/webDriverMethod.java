package webDriverMethodUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Automation\\\\ChromeDriver\\\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.close();
		Thread.sleep(1000);
		driver.navigate().to("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();

	}

}
