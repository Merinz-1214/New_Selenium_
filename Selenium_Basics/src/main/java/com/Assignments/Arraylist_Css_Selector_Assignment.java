package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Arraylist_Css_Selector_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php ");
         driver.manage().window().maximize();
         
List<WebElement> bootstrap_alert = driver.findElements(By.xpath("//div[@class='col-md-6']/button"));
         int a= bootstrap_alert.size();
         System.out.println("Size is: " +a);
         System.out.println("********************");
         
         String s= bootstrap_alert.get(0).getText();
         System.out.println("Zeroth index result is: " +s);
         System.out.println("********************");
         
         for(int i=0;i<bootstrap_alert.size();i++) {
        	String bg = bootstrap_alert.get(i).getCssValue("background-color");
        	System.out.println(bg);
         }

	}

}
