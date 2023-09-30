package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webelement_Example_Radio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		
		WebElement radio1= driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
		WebElement radio2= driver.findElement(By.xpath("(//input[@value='Male'])[2]"));
		
		boolean s= radio1.isSelected();    //by using isSelected web element command
		boolean s1 = radio2.isSelected();
		System.out.println(s);
		System.out.println(s1);
		
		boolean a = radio1.isDisplayed(); //by using isDisplayed web element command
		System.out.println(a);
		
        //boolean b = radio2.isEnabled(); //by using isEnabled web element command
        //System.out.println(b);
  
	}
}
