package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledStduy {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Automation\\\\ChromeDriver\\\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement password = driver.findElement(By.id("pass"));
		
		System.out.println(password.isEnabled());
		
		// driver.findElement(By.id("pass")).sendKeys("ashishmahamuni7876@gmail.com");
		
		//WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		//System.out.println(button.isSelected());
		

	}

}
