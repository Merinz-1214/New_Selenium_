package com.Important;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Javascript_Executer_Example2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(); 
         driver.manage().window().maximize();
         driver.get("https://www.amazon.in/");
         
         JavascriptExecutor js=(JavascriptExecutor) driver;
         WebElement Aboutus= driver.findElement(By.xpath("//a[text()='About Us']"));
         js.executeScript("arguments[0].scrollIntoView();", Aboutus);  //scroll into the element
         js.executeScript("document.body.style.zoom = '2.5'"); //zoom in[ratio can be change]
         
	}

}
