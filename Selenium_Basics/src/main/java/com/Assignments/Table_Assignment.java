package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("remote-allow-origins=*");
		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		   
		   System.out.println("-------Salary-----------");
		   List<WebElement>Salary=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[6]"));
		   for(WebElement i:Salary) {
			   String s=i.getText();
			   System.out.println(s);
		   }
		   System.out.println("-------Print data of person- \"Ashton Cox\"-----------");
		 List<WebElement> Ashton=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[3]//td"));
		 for(WebElement j:Ashton) {
			 String s1=j.getText();
			 System.out.println(s1);
		 }
		 System.out.println("------Print Start date of person Brielle Williamson----------");
		 WebElement Start_date=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[6]//td[5]"));
		 String y= Start_date.getText();
		 System.out.println(y);
		 System.out.println("------Print office of Rhona Davidson----------");
		 WebElement Rhona_office=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[8]//td[3]"));
		 String y1= Rhona_office.getText();
		 System.out.println(y1);
		 
}

}
