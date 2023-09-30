package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Arraylist_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
         driver.manage().window().maximize();
         
 List<WebElement>checkbox_list= driver.findElements(By.xpath("//div[@class='form-check']//input"));
         int a = checkbox_list.size();
         System.out.println(a);
         
         String classvalue = checkbox_list.get(1).getAttribute("class");
         System.out.println(classvalue);
         
         for(int j=0;j<checkbox_list.size();j++) {
        	checkbox_list.get(j).click();
        	boolean b1= checkbox_list.get(j).isSelected();
        	System.out.println(b1);
         }  }
}
