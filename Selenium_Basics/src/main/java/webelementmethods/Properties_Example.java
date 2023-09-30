package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Properties_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
	     driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
         driver.manage().window().maximize();
         
         //By using 'Css property' 
         WebElement Normalwarning= driver.findElement(By.xpath("//button[contains(text(),'Normal w')]"));
               String s=   Normalwarning.getCssValue("background-color");//By using CSS Property to print background color
               String s1=Normalwarning.getCssValue("color"); //to get font color
               String s2=Normalwarning.getCssValue("font-size"); //to get font size
               String s3=Normalwarning.getCssValue("font-style"); // to get font style
               System.out.println("Normal Warning");
               System.out.println(s);
               System.out.println(s1);
               System.out.println(s2);
               System.out.println(s3);
               System.out.println("    ");
               System.out.println("Autoclosable info");
               
               WebElement Autoinfo =driver.findElement(By.xpath("//button[contains(text(),'Autoclosable inf')]"));
               String b = Autoinfo .getCssValue("background-color");
               String b1 = Autoinfo .getCssValue("color");
               String b2=Autoinfo .getCssValue("font-size"); 
               String b3=Autoinfo .getCssValue("font-style"); 
               System.out.println(b);
               System.out.println(b1);
               System.out.println(b2);
               System.out.println(b3);
               System.out.println("     ");
               System.out.println("Normal Success");
               
               WebElement Normalsuccess =driver.findElement(By.xpath("//button[contains(text(),'Normal suc')]"));
               String c = Normalsuccess .getCssValue("background-color");
               String c1=Normalsuccess.getCssValue("font-size"); 
               System.out.println(c);
               System.out.println(c1);
               System.out.println("     ");
               System.out.println("Autoclosable Warning");
               
               WebElement Autoclosablewarning =driver.findElement(By.xpath("//button[contains(text(),'Autoclosable war')]"));
               String d = Autoclosablewarning .getCssValue("background-color");
               String d1=Autoclosablewarning.getCssValue("font-size"); 
               System.out.println(d);
               System.out.println(d1);
               System.out.println("     ");
               System.out.println("Autoclosable danger");
               
               WebElement Autoclosabledanger =driver.findElement(By.xpath("//button[contains(text(),'Autoclosable dang')]"));
               String y = Autoclosabledanger  .getCssValue("background-color");
               String y1=Autoclosabledanger .getCssValue("font-size"); 
               System.out.println(y);
               System.out.println(y1);
               
	}
}
