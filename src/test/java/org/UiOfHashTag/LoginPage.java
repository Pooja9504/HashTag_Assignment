package org.UiOfHashTag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPage {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
	
		//logo is present or not
		WebElement logo = driver.findElement(By.xpath("(//img[@id='logo'])[1]"));
		
		
		if (logo.isDisplayed()) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("test case failed");
		}
		System.out.println("");
		
		//functionality verification
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("Pooja kalpesh Bhavsar");
		driver.findElement(By.xpath("(//input[@placeholder='Enter your email'])[1]")).sendKeys("poojabhavsar1204@gmai.com");
		
		WebElement phoneNo = driver.findElement(By.cssSelector("input[placeholder='Enter your phone']"));
		phoneNo.sendKeys("9096699691");			
		
		
		WebElement resumeUpload = driver.findElement(By.id("inputFile"));
		resumeUpload.sendKeys("C:\\Users\\91758\\Desktop\\PoojaResume_3.3 updated.pdf");
		
		
		WebElement descriptionText = driver.findElement(By.xpath("//textarea[@placeholder='Briefly Describe Yourself']"));
		descriptionText.sendKeys("i have 3.3 year of experience in testing.I used selenium with java");
		
		driver.findElement(By.xpath("//button[@class='btn form-button font-12 font-bold']")).click();
		
		

		
	}

}
