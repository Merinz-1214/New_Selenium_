package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Select_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/select-input.php"); 
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropdown);
		//select.selectByIndex(1);
		select.selectByValue("Yellow");

	}

}
