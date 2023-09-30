package pack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class File_Upload_using_robot {

	public static void main(String[] args) throws AWTException {
		
	
   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
   ChromeOptions options = new ChromeOptions();
   options.addArguments("remote-allow-origins=*");
   WebDriver driver = new ChromeDriver(); 
   driver.get("https://the-internet.herokuapp.com/upload");
    driver.manage().window().maximize();
 
    WebElement choose_file= driver.findElement(By.xpath("//input[@id='file-upload']"));
    String path="E:\\Notes & Assignments\\Javanotes.docx";
    Actions action = new Actions(driver);
    Robot robot = new Robot();
    action.moveToElement(choose_file).click().build().perform();
    StringSelection ss = new StringSelection(path); //passed file path
 // control c; copy and save file to clipboard
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); 
    // 1 sec delay
    robot.delay(1000); //1 sec
    
    //robot action ; control v>> paste
    robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.delay(1000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	}}