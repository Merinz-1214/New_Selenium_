package com.Important;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windows_Switching_Using_Foreach_Loop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("remote-allow-origins=*");
		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://the-internet.herokuapp.com/windows");
		   
		   WebElement click_here =driver.findElement(By.xpath("//a[text()='Click Here']"));
			  click_here.click(); 
			  //WebElement New=driver.findElement(By.xpath("//h3[text()='New Window']"));
			//String s1=New.getText(); 
		//System.out.println(s1);
	//System.out.println();
			  String parentwindow_id =  driver.getWindowHandle();  //parent window or parent tab
			  System.out.println(parentwindow_id);     // parent window id 
		      Set<String>AllWindows=driver.getWindowHandles();  //all window 
		      for(String window_id:AllWindows) {
		    	  if(!AllWindows.equals(window_id)) {
		    		  driver.switchTo().window(window_id);
		    			  }}
		    	  WebElement New=driver.findElement(By.xpath("//h3[text()='New Window']"));
					String s=New.getText(); 
				System.out.println(s);
				//driver.close();
		    			 // driver.switchTo().window(parentwindow);
		    			  //click_here.click(); 
		    		  }
		    	  
		      
		      
	}


