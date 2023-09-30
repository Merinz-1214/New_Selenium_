package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Arraylist_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
	     driver.get("https://selenium.obsqurazone.com/index.php");
        
         
        // WebElement bb= driver.findElement(By.xpath("//ul[@class='navbar-nav']]")); 
        // String b1 = bb.getAttribute("class");
         //System.out.println(b1);
      
         List<WebElement>header_list=driver.findElements(By.xpath("//ul[@class='navbar-nav']//li//a"));
         int s= header_list.size();
         System.out.println(s);
         String element = header_list.get(7).getText();
        		 System.out.println(element);
        		 
        		 for (int i = 0; i < header_list.size(); i++) {
        				String header_name = header_list.get(i).getText();
        				System.out.println(header_name);
        				String header_class = header_list.get(i).getAttribute("class");
        				System.out.println(header_class);
        			}
        
        }}
	
