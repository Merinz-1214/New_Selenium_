package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment_Xpath_Sendkeys {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	         driver.manage().window().maximize();
	         
	         WebElement MessageField= driver.findElement(By.xpath("//input[@id='single-input-field']"));
	         MessageField.sendKeys("Hello World");
	         WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
	         button.click();
	}

}
