package com.mouseinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Keyboard_Interaction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
         
         WebElement upload= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
         //upload.sendKeys("pen" +Keys.ENTER);
         upload.sendKeys("Samsung Galaxy s22 ultra" );
         upload.sendKeys(Keys.BACK_SPACE); //for delete last letter of the element
         upload.sendKeys(Keys.chord(Keys.CONTROL,"A")); //for delete whole element 
         upload.sendKeys(Keys.BACK_SPACE);
       
	}

}
