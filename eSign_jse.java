package eSign;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class eSign_jse
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		String path="/home/am-pc-37/Downloads/chromedriver_linux64/chromedriver";
		System.setProperty("webdriver.chrome.driver",path );
		WebDriver d=new ChromeDriver();
		d.get("https://app.documentesign.com/auth/login");
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("priya@angularminds.in");
		Thread.sleep(2000);
		d.findElement(By.id("exampleInputPassword1")).sendKeys("Angular@am277");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//a[contains(text(),'Documents')]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//body/app-root[1]/app-layout-document[1]/div[1]/div[1]/div[1]/app-document-list[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(7000);
		StringSelection s = new StringSelection("/home/am-pc-37/Documents/data 1.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]/app-step-one[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-file-drag[1]/div[1]/div[1]/div[3]")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//span[contains(text(),'Add recipients')]")).click();
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div"
	    		+ "[1]/div[2]/app-step-two[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("T1");
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/"
				+ "div[1]/div[2]/app-step-two[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/di"
				+ "v[3]/input[1]")).sendKeys("lipefe9510@zherben.com");
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		Thread.sleep(4000);
		d.findElement(By.xpath("//span[contains(text(),'Prepare document')]")).click();
		Thread.sleep(5000);
		d.manage().window().maximize();
		Thread.sleep(3000);
		//d.findElement(By.xpath("/html/body/app-root/layout-auth/app-request-sign-wizard/div/div[2]"));
		Actions a = new Actions(d);
		//scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
