package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         
         WebElement EmailField= driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
         EmailField.sendKeys("mntv1222@gmail.com");
         WebElement passwordField= driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
         passwordField.sendKeys("Merin@1214");
         WebElement login= driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
         login.click();
         
	}

}
