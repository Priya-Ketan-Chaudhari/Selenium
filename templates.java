package Com.swag_labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class templates 
{
	
	public WebDriver d; 
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
	System.out.println("Launch chrome browser");
    System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
    d=new ChromeDriver();
    d.get("https://app.documentesign.com/auth/login");
	Thread.sleep(3000);
	d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("priya@angularminds.in");
	Thread.sleep(2000);
	d.findElement(By.id("exampleInputPassword1")).sendKeys("Angular@am277");
	Thread.sleep(2000);
	d.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	Thread.sleep(5000);
	}
	
	 @Test
     public void templates() throws InterruptedException
		{
			d.findElement(By.xpath("//a[contains(text(),'Templates')]")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//body/app-root[1]/layout-app[1]/div[1]/div[1]/div[1]/app-template-list[1]/div[1]/div[1]/button[1]")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@id='fileDropRef']")).sendKeys("/home/am-pc-03/Downloads/Data.csv");
			
			
		}
	 
	 @AfterTest
	    public void logout() throws InterruptedException
	    {
		    
	           Thread.sleep(3000);
	            d.quit();
	    }

}
