package pack;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_Upload {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
		     driver.get("https://the-internet.herokuapp.com/upload");
	         
	         WebElement upload= driver.findElement(By.xpath("//input[@id='file-upload']"));
	        //upload.sendKeys("E:\\Notes & Assignments\\Javanotes.docx");  // using send keys 
	         
	         
	         File file =new File("E:\\Notes & Assignments\\Javanotes.docx"); //using file class
	         upload.sendKeys(file.getAbsolutePath());
	         
	}

}
