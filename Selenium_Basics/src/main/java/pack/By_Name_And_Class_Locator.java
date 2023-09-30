package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class By_Name_And_Class_Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         
         //WebElement productSearchField = driver.findElement(By.name("login")); //by name
         //To click
         //productSearchField.click();
         //To provide the input
         //productSearchField.sendKeys("pencil");
         
         WebElement productSearchButton = driver.findElement(By.className("inputtext _55r1 _6luy"));//by class name
         productSearchButton.click();
	}}
         
	
