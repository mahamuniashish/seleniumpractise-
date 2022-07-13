package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class isDisplayed {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Automation\\\\ChromeDriver\\\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		WebElement checkelement = driver.findElement(By.id("show-textbox"));

		System.out.println(checkelement.isDisplayed());
		
		driver.findElement(By.id("hide-textbox")).click();
		
		System.out.println(checkelement.isDisplayed());
		
	}

}
