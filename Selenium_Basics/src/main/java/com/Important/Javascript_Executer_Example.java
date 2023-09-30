package com.Important;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Javascript_Executer_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(); 
         driver.manage().window().maximize();
         //driver.get("https://www.meesho.com/ ");
         driver.get("https://selenium.obsqurazone.com/form-submit.php");
         
         JavascriptExecutor js=(JavascriptExecutor) driver; //explicit type conversion
         //js.executeScript("alert('merin')");  //for Alert
         //js.executeScript("window.scrollBy(0,200)"); //Scroll down 
         //js.executeScript("window.scrollBy(0,600)"); 
         //js.executeScript("window.scrollBy(0,900)"); 
         //js.executeScript("window.scrollBy(100,200)"); //scroll down x,y coordinate
         
        
         WebElement submit= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
         js.executeScript("arguments[0].click();",submit);  // for click ; arg value is always '0'

}}
