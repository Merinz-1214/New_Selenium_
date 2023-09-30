package xpathmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tooltip_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://demo.guru99.com/test/social-icon.html");
         driver.manage().window().maximize();
         
         WebElement login= driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
         String s = login.getAttribute("title");
         System.out.println(s);
        		

	}

}
