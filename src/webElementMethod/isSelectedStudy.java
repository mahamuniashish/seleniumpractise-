package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isSelectedStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Automation\\ChromeDriver\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("firstname")).sendKeys("Ashish");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Mahamuni");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("9970860237");
		Thread.sleep(1000);
		driver.findElement(By.id("password_step_input")).sendKeys("AshishM@12345");
		Thread.sleep(1000);
		WebElement Birthdate = driver.findElement(By.name("birthday_day"));
		WebElement BirthMonth = driver.findElement(By.name("birthday_month"));
		WebElement BirthYear = driver.findElement(By.name("birthday_year"));

		Select s = new Select(Birthdate);
		Thread.sleep(1000);
		s.selectByIndex(4);
		Thread.sleep(1000);
		s.selectByValue("7");
		Thread.sleep(1000);
		s.selectByVisibleText("20");

		Select s1 = new Select(BirthMonth);
		Thread.sleep(1000);
		s1.selectByIndex(0);
		Thread.sleep(1000);
		s1.selectByValue("10");
		Thread.sleep(1000);
		s1.selectByVisibleText("Apr");

		Select s2 = new Select(BirthYear);
		Thread.sleep(1000);
		s2.selectByIndex(5);
		Thread.sleep(1000);
		s2.selectByValue("2000");
		Thread.sleep(1000);
		s2.selectByVisibleText("2005");
		Thread.sleep(2000);

		boolean gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
		System.out.println("Selection of Radio button(male) is :" + gender);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		boolean gender1 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
		System.out.println("Selection of Radio button(male) is :" + gender1);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();



	}

}
