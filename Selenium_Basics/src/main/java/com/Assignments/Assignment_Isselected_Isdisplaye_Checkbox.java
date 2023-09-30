package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment_Isselected_Isdisplaye_Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php"); 
		driver.manage().window().maximize();
		WebElement singlecheck = driver.findElement(By.xpath("//input[@id='gridCheck'] "));
		WebElement mutiplecheck1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement mutiplecheck2=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement mutiplecheck3=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement mutiplecheck4=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		
		boolean s = singlecheck.isSelected();
		boolean m1 = mutiplecheck1.isSelected();
		boolean m2 = mutiplecheck2.isSelected();
		boolean m3 = mutiplecheck3.isSelected();
		boolean m4 = mutiplecheck4.isSelected();
		System.out.println("Single checkbox result is: "+s);
		System.out.println("Multiple checkbox one result is: "+m1);
		System.out.println("Multiple checkbox two result is: "+m2);
		System.out.println("Multiple checkbox three result is: "+m3);
		System.out.println("Multiple checkbox four result is: "+m4);
		
		boolean x = singlecheck.isDisplayed();
		boolean y1 = mutiplecheck1.isDisplayed();
		boolean y2 = mutiplecheck2.isDisplayed();
		boolean y3 = mutiplecheck3.isDisplayed();
		boolean y4 = mutiplecheck4.isDisplayed();
		System.out.println(x);
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		System.out.println(y3);
		

	}

}
