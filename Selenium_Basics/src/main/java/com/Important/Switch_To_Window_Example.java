package com.Important;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Switch_To_Window_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("remote-allow-origins=*");
		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://the-internet.herokuapp.com/windows");
			
			  WebElement click_here =driver.findElement(By.xpath("//a[text()='Click Here']"));
			  click_here.click(); 
			  //click_here.click(); 
				  //WebElement New=driver.findElement(By.xpath("//h3[text()='New Window']"));
				  //String s1=New.getText(); 
				  //System.out.println(s1);
				 
		      String parentwindow =  driver.getWindowHandle(); // get windows/tab code; temporary id
		      //System.out.println();
		      Set<String>Windows=driver.getWindowHandles(); // id of all open tabs into set
		      System.out.println(Windows.size());           //to get size of the tabs
		      
		      Iterator<String> iterate = Windows.iterator();
		      while(iterate.hasNext()){
		    	  String Child_Window = iterate.next();
		    	  if(parentwindow.equals(Child_Window)) {
		    		  System.out.println("No need to switch");}
		    		  else {
		    			  System.out.println("Need to switch");
		    			  driver.switchTo().window(Child_Window);
		    		  }
		    	  }
		      WebElement New=driver.findElement(By.xpath("//h3[text()='New Window']"));
			  String s1=New.getText(); 
			  System.out.println(s1);   
			  driver.close();
			  driver.switchTo().window(parentwindow);
			  click_here.click(); 
		      }
		    
		   
		 

	}


