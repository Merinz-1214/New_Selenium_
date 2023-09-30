package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.org.apache.xml.internal.security.signature.Reference;

public class Attribute_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	     driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
         
         WebElement button= driver.findElement(By.xpath("//button[@id='button-one']")); 
         String b = button.getTagName();      // Webelement command for get tag name
         
         String b1 = button.getAttribute("class");   //Webelement command to get attribute
         System.out.println(button.getSize());         // Webelement command for size
         System.out.println(button.getLocation());  // Webelement command for location 
         System.out.println(b);
         System.out.println(b1);
         String s= driver.getPageSource();           //Webelement command to print HTML source code in console
         System.out.println(s);
	}

}
