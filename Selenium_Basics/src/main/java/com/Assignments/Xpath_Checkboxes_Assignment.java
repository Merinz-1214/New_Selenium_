package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_Checkboxes_Assignment {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
         driver.manage().window().maximize();
         
         WebElement singlecheckbox = driver.findElement(By.xpath("//label[contains(text(),'Click on this check box')]"));
         singlecheckbox.click();
         WebElement checkbox1 = driver.findElement(By.xpath("//label[contains(text(),'Check Box')]"));
         checkbox1.click();
         WebElement checkbox2 = driver.findElement(By.xpath("//label[contains(text(),'Two')]"));
         checkbox2.click();
         WebElement checkbox3 = driver.findElement(By.xpath("//label[contains(text(),'Three')]"));
         checkbox3.click();
         WebElement checkbox4 = driver.findElement(By.xpath("//label[contains(text(),'Four')]"));
         checkbox4.click();
        
	}

}
