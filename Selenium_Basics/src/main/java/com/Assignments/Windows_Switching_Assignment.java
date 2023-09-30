package com.Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windows_Switching_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("remote-allow-origins=*");
		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://selenium.obsqurazone.com/window-popup.php ");
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   WebElement Like_us_on_fb=driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']"));
		   Like_us_on_fb.click();
		   String parentWindow=driver.getWindowHandle();
		   Set<String>handle=driver.getWindowHandles();
		   for(String windowid:handle) {
			   if(!handle.equals(parentWindow)) {
				   driver.switchTo().window(windowid);
			   }
		   }
		   WebElement Connect_FB=driver.findElement(By.xpath("(//span[text()='Connect with Obsqura Zone on Facebook'])[2]"));
		   String s= Connect_FB.getText();
		   System.out.println(s);
		   driver.close();
	}

}
