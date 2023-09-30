package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Select_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/"); 
		driver.manage().window().maximize();
		
		 WebElement selectdrop= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(selectdrop);
		// By using Select Class :DropDown
	     select.selectByIndex(1);  // by using index
	     select.selectByValue("search-alias=amazon-pharmacy"); //by passing value of attribute
	     select.selectByVisibleText("All Categories");  //by text
	     select.selectByVisibleText("Amazon Pharmacy"); 
	     
	     //to get the all options
	     
	    
	     List<WebElement> all_options = driver.findElements(By.xpath("//select[@id='searchDropdownBox']//option"));
			for (int i = 0; i < all_options.size(); i++) {
				System.out.println(all_options.get(i).getText());
			}
	     
	    	     
		
}}




//select.getOptions()