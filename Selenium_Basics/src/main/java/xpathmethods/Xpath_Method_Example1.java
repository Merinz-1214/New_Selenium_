package xpathmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_Method_Example1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/login/");
         driver.manage().window().maximize();
         
         WebElement productSearchField= driver.findElement(By.xpath("//a[text()='Forgotten password?']")); //xpath by using text
      productSearchField.click();
       //WebElement productlogin = driver.findElement(By.className("//button[text()='Log in']")); //xpath by using text
       //productlogin.click();
       //Thread.sleep(3000);
       //WebElement forgotten = driver.findElement(By.className("//a[contains(text(),'Forgotten')]")); //xpath by using contains text
       //forgotten.click();
	}

	}


//driver.get("https://www.facebook.com/login/");



//example : //a[starts-with(@id,'nav-logo-sprites')]//following::input[@id='twotabsearchtextbox']   : amazon 
	//needs: suppose logo missing 