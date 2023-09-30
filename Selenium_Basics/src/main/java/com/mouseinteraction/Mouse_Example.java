package com.mouseinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://selenium.obsqurazone.com/window-popup.php");
         driver.manage().window().maximize();
         
         WebElement likefacebook=driver.findElement(By.xpath("//a[contains (text(),'Like us On Facebook')]"));
         Actions actions=new Actions(driver);
         //actions.moveToElement(likefacebook).build().perform();
         actions.click(likefacebook).build().perform();   // with parameter - eg:method overloading
         actions.click();//without parameter
         
	}

}
