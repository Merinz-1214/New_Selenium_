package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Checkbox_Radiobutton_Mouseaction_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     //driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php ");
         driver.manage().window().maximize();
         
        // WebElement checkbox1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
        // Actions action=new Actions(driver);
         //action.click(checkbox1).build().perform();
         
         WebElement radiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
         Actions action=new Actions(driver);
         action.click(radiobutton).build().perform();
         boolean b = radiobutton.isSelected();
         System.out.println(b);

	}

}
