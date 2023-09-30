package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Css_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
         driver.manage().window().maximize();
         
         WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
         String s = button.getAttribute("class");
         System.out.println(s);
         
         String s1= button.getCssValue("color");
         String s2=button.getCssValue("background-color");
         System.out.println("Font color of the show message button is " +s1);
         System.out.println("Background color of the show message button is " +s2);
	}

}
