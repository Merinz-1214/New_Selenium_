package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
         driver.manage().window().maximize();
         //Alert Examples
         WebElement JsAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
         JsAlert.click();
         driver.switchTo().alert().accept();
         WebElement Confirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
         Confirm.click();
        String s = driver.switchTo().alert().getText();
        System.out.println(s);
       
         WebElement Prompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        Prompt.click();
         
         driver.switchTo().alert().dismiss();    //for cancel alert
        
         driver.switchTo().alert().sendKeys("ok");
         driver.switchTo().alert().accept();

	}

}
