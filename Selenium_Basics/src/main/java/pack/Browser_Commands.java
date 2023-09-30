package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Commands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
 //Browser Commands
		//Launch browser
		WebDriver driver = new ChromeDriver();    //Runtime Polymorphism

		//int a=10;
		driver.get("https://amazon.in");    //Command for get URL
		driver.manage().window().maximize(); //command for maximising window
		String url = driver.getCurrentUrl();
          //System.out.println(a);
          System.out.println(url);

           driver.getTitle(); //for print title
           String s = driver.getTitle();
           System.out.println(s);
           

}}
