package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Error_Messages_Print_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://selenium.obsqurazone.com/form-submit.php");
         driver.manage().window().maximize();
         
         WebElement firstname= driver.findElement(By.xpath("//input[@class='form-control']"));
         firstname.sendKeys("Merin"+Keys.ENTER);
         
        // WebElement submit= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
         //submit.click();
         
         List<WebElement>errormessage=driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
       //form[@class='needs-validation was-validated']//following::div[@class='invalid-feedback'] >>or we can use this X-path
         for(int i=0;i<errormessage.size();i++) {
        	 String s = errormessage.get(i).getText();
        	 System.out.println(s);
         }
		

	}

}
