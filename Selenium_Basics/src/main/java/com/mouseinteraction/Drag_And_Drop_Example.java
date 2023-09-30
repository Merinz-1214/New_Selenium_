package com.mouseinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://demo.guru99.com/test/drag_drop.html");
         driver.manage().window().maximize();
         
 WebElement source_webelement = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
 WebElement destination_webelement = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
 	//Drag and drop example	
 		Actions actions = new Actions(driver);
 		actions.dragAndDrop(source_webelement, destination_webelement).build().perform();
 		
 		
	}

}
