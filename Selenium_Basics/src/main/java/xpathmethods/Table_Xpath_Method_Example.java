package xpathmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table_Xpath_Method_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("remote-allow-origins=*");
		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		   
		   //WebElement office=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[3]"));
		   //String s= office.getText();
		   //System.out.println(s);
		   WebElement ref=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td[4]"));
		   String y =ref.getText();
		   System.out.println(y);

		   List<WebElement>table =driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th"));
		   System.out.println("----------------Using for loop---------------------");
		 for (int i = 0; i < table.size(); i++) {
				String s1 = table.get(i).getText();
				System.out.println(s1);
				String s = table.get(i).getAttribute("class");
				System.out.println(s);
		 }
					
				// Using enhanced for loop
		   //System.out.println("----------------using foreach loop----------------------------");
				//for(WebElement j :table ) {
					// String s2 = j.getText();
					 //System.out.println(s2);	
		   System.out.println("----------------row list--------------------------------");
		   List<WebElement>table2=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		   for(WebElement x:table2) {
			   String s3=x.getText();
			   System.out.println(s3);
		   }
		   System.out.println("----------------column list--------------------------------");
		   List<WebElement>table1=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td"));
		   for(WebElement x1:table1) {
			   String s4 = x1.getText();
			   System.out.println(s4);
		   }
				}
	}



