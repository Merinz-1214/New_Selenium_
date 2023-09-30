package xpathmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
         
         WebElement Hellosignin= driver.findElement(By.xpath("span[contains(text(),'Hello, sign in')]")); 
       Hellosignin.click();
       
		//span[contains(text(),'Select your address')] 
		//span[contains(text(),'Hello, sign in')]  
       //forgottenpassword

	}

}
