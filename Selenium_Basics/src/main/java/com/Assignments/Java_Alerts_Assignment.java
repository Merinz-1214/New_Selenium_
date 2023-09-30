package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Java_Alerts_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
         driver.manage().window().maximize();
         
         WebElement alert1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
         alert1.click();
         String s= driver.switchTo().alert().getText();
         System.out.println(s);
         driver.switchTo().alert().accept();
         WebElement alert2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
         alert2.click();
         driver.switchTo().alert().dismiss();
         WebElement alert3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
         alert3.click();
         driver.switchTo().alert().sendKeys("Merin");
         driver.switchTo().alert().accept();

	}

}
