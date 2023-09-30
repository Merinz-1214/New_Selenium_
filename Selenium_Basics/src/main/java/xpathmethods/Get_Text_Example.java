package xpathmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Text_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/");
          
         WebElement login= driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
         String s = login.getText();
         System.out.println(s);
         
         WebElement forgotten= driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
         String s1 = forgotten.getText();
         System.out.println(s1);
	}}
