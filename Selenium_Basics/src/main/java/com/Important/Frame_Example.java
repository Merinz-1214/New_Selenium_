package com.Important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("remote-allow-origins=*");
		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://the-internet.herokuapp.com/nested_frames");
		   //driver.switchTo().frame(0); //By using Index
		   driver.switchTo().frame("frameset-middle"); //by using webelement
		   driver.switchTo().frame("frame-middle"); //by using Name/ID Attribute 
		   
		 WebElement text=driver.findElement(By.xpath("//div[text()='MIDDLE']"));
		   String s= text.getText();
		   System.out.println(s);
		    
		 

	}

}
