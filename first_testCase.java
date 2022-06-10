package Com.swag_labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class first_testCase 
{
	WebDriver d=null;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		d=new ChromeDriver();
		d.get("https://app.documentesign.com/auth/login");
		d.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void verifyPage()
	{
		String title=d.getTitle();
		System.out.println("The page title is = " + title);
		Assert.assertEquals(title, "Document eSign | Login");
	}
	
	@Test(priority=2)
	public void VerifyLogo()
	{
		boolean logo= d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).isDisplayed();
	    Assert.assertTrue(logo, "Logo is present");
	
	}
	
	@Test
	public void verifyLoginPage()
	{
		boolean email =d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).isEnabled();
	    Assert.assertTrue(email, "");
	
	}
	@Test
	public void templates()
	{
		d.findElement(By.xpath("//a[contains(text(),'Templates')]")).click();
		d.findElement(By.xpath("//body/app-root[1]/layout-app[1]/div[1]/div[1]"
				+ "/div[1]/app-template-list[1]/div[1]/div[1]/button[1]")).click();
		d.findElement(By.xpath("//input[@id='fileDropRef']")).click();
		
		
	}
	
	@AfterTest
	public void  complete() throws InterruptedException
	{
		Thread.sleep(2000);
		d.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
