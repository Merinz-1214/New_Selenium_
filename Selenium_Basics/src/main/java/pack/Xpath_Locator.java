package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
         
         //WebElement productSearchField= driver.findElement(By.xpath("//input[@name='field-keywords']")); 
       //productSearchField.sendKeys("pen");
       
       WebElement productSearchField= driver.findElement(By.xpath("//select[@name='url']"));
       productSearchField.click();
      
	}

}
