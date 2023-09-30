package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment_Xpath_Methods_Submit_Form {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
         driver.manage().window().maximize();
         WebElement Formclick= driver.findElement(By.xpath("//a[contains(text(),'Form Submit')]"));
         Formclick.click();
         WebElement firstname= driver.findElement(By.xpath("//input[@id='validationCustom01']"));
         firstname.sendKeys("Merin");
         WebElement secondname = driver.findElement(By.xpath("//input[@id='validationCustom02']"));
         secondname.sendKeys("T Varghese");
         WebElement username = driver.findElement(By.xpath("//input[contains(@id,'validationCustomUsername')]"));
         username.sendKeys("@merin");
         WebElement city = driver.findElement(By.xpath("//input[starts-with(@id,'validationCustom03')]"));
         city.sendKeys("Alappey");
         WebElement state = driver.findElement(By.xpath("//input[contains(@id,'validationCustom04')]"));
        state.sendKeys("Alappey");
        WebElement zip = driver.findElement(By.xpath("//input[starts-with(@id,'validationCustom05')]"));
        zip.sendKeys("123");
        WebElement checkbox = driver.findElement(By.xpath("//input[starts-with(@id,'invalidCheck')]"));
        checkbox.click();
         WebElement submit= driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-')]"));
         submit.click();
	}

}
