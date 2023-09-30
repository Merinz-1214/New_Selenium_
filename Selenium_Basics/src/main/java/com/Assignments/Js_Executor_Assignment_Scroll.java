package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Js_Executor_Assignment_Scroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(); 
         driver.manage().window().maximize();
         driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		JavascriptExecutor js =(JavascriptExecutor)driver;
    WebElement Patient_Age_Group = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
    js.executeScript("arguments[0].scrollIntoView()",Patient_Age_Group );
    boolean b= Patient_Age_Group.isSelected();
    System.out.println(b);
	}

}
