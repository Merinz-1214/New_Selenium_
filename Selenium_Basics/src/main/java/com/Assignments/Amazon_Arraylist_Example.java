package com.Assignments;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public abstract class Amazon_Arraylist_Example {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/"); 
		driver.manage().window().maximize();
		
		List<WebElement>amazon_headertext= driver.findElements(By.xpath("//div[@id='nav-xshop']//a"));
		int size = amazon_headertext.size();
		System.out.println("Size: "+size);
		
		String s= amazon_headertext.get(3).getAttribute("class");
		System.out.println(s);
		
		for (int i=0;i<amazon_headertext.size();i++) {
			String text=amazon_headertext.get(i).getText();
			System.out.println(text);
		}

	}

}
