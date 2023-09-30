package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Css_Locator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		//driver.get("https://www.mgu.ac.in/");
         driver.manage().window().maximize();
         
         WebElement productSearchField= driver.findElement(By.cssSelector("#twotabsearchtextbox"));// CSS by ID
         productSearchField.sendKeys("pen");
         //driver.findElement(By.cssSelector(".search-query.form-control")).click(); //CSS by class
	}

}
