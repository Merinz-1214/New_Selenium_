package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment_Showdate_Getattribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://selenium.obsqurazone.com/date-picker.php");
         driver.manage().window().maximize();
         
         WebElement showdate= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
         String s = showdate.getAttribute("id");
         System.out.println(s);
	}

}
