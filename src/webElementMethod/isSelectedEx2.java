package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedEx2 {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","F:\\\\Automation\\\\ChromeDriver\\\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		
		WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
		
		boolean Result = female.isSelected();
		
		if(Result==true)
		{
			System.out.println("Radio button is already selected");
		}
		else
		{
			System.out.println("Radio button is not selected");
			female.click();
			
			boolean Result1 = female.isSelected();
			
			if(Result1==true)
			{
				System.out.println("Radio button is selected now");
			}
			else
			{
				System.out.println("Radio button is not select");
			}
			
		}
	}

}
