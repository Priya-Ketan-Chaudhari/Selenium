package demo;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_demo1
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "/home/am-pc-37/Downloads/chromedriver_linux64/chromedriver");
        WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.google.com/");
		  Thread.sleep(2000);
		d.findElement(By.name("q")).sendKeys("java version",Keys.ENTER);
		//Robot r = new Robot();r.keyPress(KeyEvent.VK_ENTER);
	   // r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    d.navigate().back();
	    d.quit();
		
		
		
		
		
		
		
		
		
		
	}

}