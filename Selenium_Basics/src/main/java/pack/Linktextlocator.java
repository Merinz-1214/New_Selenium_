package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Linktextlocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         WebElement productSearchField= driver.findElement(By.linkText("Forgotten password?")); //by link text
         productSearchField.click(); 
         //WebElement Forgottenaccount= driver.findElement(By.partialLinkText(" password?")); //by partial link text
         //Forgottenaccount.click();

	}

}
