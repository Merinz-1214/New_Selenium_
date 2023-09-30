package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebElement;

public class Id_Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		
         driver.manage().window().maximize();
         driver.get("https://www.amazon.in/");
         
         WebElement productSearchField = driver.findElement(By.id("twotabsearchtextbox"));
         //To click
         productSearchField.click();
         //To provide the input
         productSearchField.sendKeys("pencil");
         
         WebElement productSearchButton = driver.findElement(By.id("nav-search-submit-button"));
         productSearchButton.click();
         
	}

}
