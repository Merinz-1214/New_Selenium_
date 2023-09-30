package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Js_Executer_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		   
		   JavascriptExecutor js=(JavascriptExecutor) driver; 
		   WebElement Enter_Message = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		   Enter_Message.sendKeys("Hello");
		   WebElement Show_Message=driver.findElement(By.xpath("//button[@id='button-one']"));
		   js.executeScript("arguments[0].click()", Show_Message);

	}

}
