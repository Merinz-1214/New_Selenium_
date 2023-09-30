package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1_Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.obsqurazone.com/software-testing-courses-kerala/");
         driver.manage().window().maximize();
         
         WebElement idlocator = driver.findElement(By.name("course_category"));
         idlocator.click();
	}
	//driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
			//driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	//WebElement startdownload= driver.findElement(By.xpath("//button[text()='Start Download']"));
    //startdownload.click();  //Xpath using text Assignment 1
}
