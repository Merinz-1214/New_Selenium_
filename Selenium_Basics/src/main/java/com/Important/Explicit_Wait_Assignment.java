package com.Important;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php ");
         driver.manage().window().maximize();
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         
         WebElement start_download=driver.findElement(By.xpath("///button[@id='downloadButton']"));
         wait.until(ExpectedConditions.elementToBeClickable(start_download)).click();
         //start_download.click();
         //then print message "Complete!" by getText() of element. Then print background color of close Button. "Strictly use only Explicit wait"
         
         //String s=start_download.getText();
         //System.out.println(s);
         //String s1=start_download.getCssValue("background-color");
         //System.out.println(s1);
	}

}
