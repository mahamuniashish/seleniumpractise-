package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Automation\\\\ChromeDriver\\\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("ashishmahamuni7876@gmail.com");
		//driver.findElement(By.id("email")).clear();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		//driver.findElement(By.id("email")).sendKeys("997086");
		//driver.findElement(By.id("email")).clear();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		String text = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		System.out.println("text "+text);

		//driver.quit();
	}

}
