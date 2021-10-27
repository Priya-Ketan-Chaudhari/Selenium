package rorbotdemo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class alerts
{
	 static String driverpath="/usr/bin/chromedriver";

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", driverpath);
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		String  msg= driver.switchTo().alert().getText();
		System.out.println(msg);
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(1000);
		driver.quit();
		
		

	}
}
