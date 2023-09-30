package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_edgebrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.edge.driver", "D:\\edgedriver\\edgedriver_win64\\edgedriver.exe");
		//WebDriver Driver = new EdgeDriver();
		//Webdriver Driver = new FireFoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();  
				
			//driver.navigate().to("https://www.facebook.com/");
				
				//WebElement productSearchField = driver.findElements(1);
		
	}

}
