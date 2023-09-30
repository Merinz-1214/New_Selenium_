package com.mouseinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Sendkeys_Examp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // Example of run time polymorphism.
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement enter_text =driver.findElement(By.xpath("//input[@id='single-input-field']"));
        Actions actions = new Actions(driver);
		actions.sendKeys(enter_text, "Merin").build().perform();
		
		actions.clickAndHold(enter_text).build().perform();
		actions.release(enter_text).build().perform();
		

	}

}
