package eSign;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_demo {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "/home/am-pc-37/Downloads/chromedriver_linux64/chromedriver");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.google.co");
		Thread.sleep(3000);
		d.findElement(By.name("q")).sendKeys("humanclouds");
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		d.quit();
		
	
		

	}

}
