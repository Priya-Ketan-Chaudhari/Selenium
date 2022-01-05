package eSign;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class eSign_flow
{
	public static void main(String[] args) throws InterruptedException
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
		WebElement upload= d.findElement(By.xpath("//input[@id='fileDropRef']"));
		upload.sendKeys("/home/am-pc-37/Documents/data.csv");
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]/app-step-one[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/am-button[1]/button[1]")).click();                       
		Thread.sleep(5000);
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]/app-step-two[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("T1");
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]/app-step-two[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]")).sendKeys("lipefe9510@zherben.com");
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]/app-step-two[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/am-button[2]/button[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id='page-wrapper-0']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]/app-step-three[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-document-editor[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-placeholder-field-type[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();   
		Thread.sleep(3000);
	    d.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-choose-placeholder[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-choose-placeholder[1]/div[1]/form[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]")).click();
	    Thread.sleep(3000);
	    d.findElement(By.xpath("//span[contains(text(),'Review request')]")).click();
	    Thread.sleep(3000);
	    d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]/app-step-four[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/am-button[2]/button[1]")).click();
	    Thread.sleep(3000);	
        d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-step-five[1]/div[1]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(3000);	
	    d.findElement(By.xpath("//div[contains(text(),'P')]")).click();
	    Thread.sleep(3000);
	    d.findElement(By.xpath("//body/app-root[1]/layout-app[1]/am-topbar[1]/nav[1]/div[1]/div[3]/div[1]/a[6]")).click();
	    Thread.sleep(3000);
	    d.quit();
	
	}

}

