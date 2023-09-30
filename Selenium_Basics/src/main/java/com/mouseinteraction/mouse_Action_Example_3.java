package com.mouseinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouse_Action_Example_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
         driver.manage().window().maximize();
         
         WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
         WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
         Actions action=new Actions(driver);
         //action.contextClick(rightclick).build().perform();//with parameter
        // action.contextClick().build().perform();//without parameter
         //action.doubleClick().build().perform();
         action.doubleClick(doubleclick).build().perform();

	}

}
