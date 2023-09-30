package com.mouseinteraction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Example_Robot_1 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(); 
         driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php ");
         driver.manage().window().maximize();
         
        // Robot robot = new Robot();
// Zoom in>>
//    robot.keyPress(KeyEvent.VK_CONTROL);
//         robot.keyPress(KeyEvent.VK_ADD);
//         robot.keyPress(KeyEvent.VK_CONTROL);
//         robot.keyPress(KeyEvent.VK_ADD);
        // robot.keyPress(KeyEvent.VK_DOWN);
        // robot.keyPress(KeyEvent.VK_DOWN);
         //robot.keyPress(KeyEvent.VK_DOWN);
         //robot.keyPress(KeyEvent.VK_DOWN);
         //robot.keyPress(KeyEvent.VK_DOWN);
         //robot.keyPress(KeyEvent.VK_DOWN);
         
         Actions action = new Actions(driver);
         //WebElement htmltag=driver.findElement(By.tagName("HTML"));
        // action.sendKeys(htmltag,Keys.CONTROL,Keys.ALT).build().perform();
         action.keyDown(Keys.chord(Keys.CONTROL,Keys.ADD)).build().perform();
         action.keyDown(Keys.chord(Keys.CONTROL,Keys.ADD)).build().perform();
         
        
	}

}
