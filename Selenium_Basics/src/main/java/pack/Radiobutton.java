package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
         driver.manage().window().maximize();
         
         //WebElement button= driver.findElement(By.xpath("//input[@id='inlineRadio1']")); //male
         //button.click();
         WebElement button= driver.findElement(By.xpath("//input[@id='inlineRadio2']")); //female
         button.click();
         		
	}

}

