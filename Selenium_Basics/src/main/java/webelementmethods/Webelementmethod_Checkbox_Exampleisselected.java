package webelementmethods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webelementmethod_Checkbox_Exampleisselected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		//driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
         driver.manage().window().maximize();
         WebElement checkbox1= driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]")); 
        
         WebElement checkbox2= driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]")); 
         boolean value = checkbox1.isSelected();
         System.out.println("checkbox 1 selected: " +value);
         boolean value1 = checkbox2.isSelected();
         System.out.println("checkbox 2 selected: " +value1);
         if(value==false) {
        	 checkbox1.click();
         }
         if(value1==false) {
        	 checkbox2.click();
        	 
         }
         }
}
      