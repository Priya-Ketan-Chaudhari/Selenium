package Com.swag_labs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class eSign_document 
{
       public static  WebDriver d;
       
	 @BeforeTest()
	 public void setup()
	 {
	     System.setProperty("webdriver.chrome.driver","/home/am-pc-37/chromedriver");
         d=new ChromeDriver();
         d.get("https://app.documentesign.com/auth/login");
         d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);


         d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("priya@angularminds.in");
         d.findElement(By.id("exampleInputPassword1")).sendKeys("Priya@1221");
         d.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	 }
	 
	 
	 @Test
	 public void document() throws InterruptedException
	 {
         d.findElement(By.xpath("//a[contains(text(),'Documents')]")).click();
         //upload document
         d.findElement(By.xpath("//body/app-root[1]/app-layout-document[1]/div[1]"
         		+ "/div[1]/div[1]/app-document-list[1]/div[1]/div[1]/button[1]")).click();
         WebElement upload= d.findElement(By.xpath("//input[@id='fileDropRef']"));
		upload.sendKeys("/home/am-pc-37/data2.csv");
		//Add recipients button
		Thread.sleep(5000);
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]"
				+ "/app-step-one[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/am-button[1]/button[1]")).click();
		
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]"
				+ "/app-step-two[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Priya");
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]"
				+ "/app-step-two[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]")).sendKeys("priya@angularminds.in");
		d.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		//Prepare document
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]"
				+ "/app-step-two[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/am-button[2]/button[1]")).click();
		//Add signature
		WebElement page = d.findElement(By.xpath("//div[@id='page-overlay-0']"));
		page.click();
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]/app-step-three[1]"
				+ "/div[1]/div[1]/div[1]/div[2]/div[1]/app-document-editor[1]/div[1]/div[1]/div[1]/div[1]/div[1]"
				+ "/app-placeholder-field-type[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
		d.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-choose-placeholder[1]/div[1]/form[1]"
				+ "/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		//Add recipient form dd
		d.findElement(By.xpath("//body[1]/modal-container[1]/div[1]/div[1]/app-choose-placeholder[1]"
				+ "/div[1]/form[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
	     // review request
		d.findElement(By.xpath("//body[1]/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]"
				+ "/div[2]/app-step-three[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/am-button[2]/button[1]")).click();
	       d.findElement(By.xpath("//body[1]/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]"
	       		+ "/div[2]/app-step-four[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/am-button[2]/button[1]")).click();
	       Thread.sleep(2000);
	 } 
	       @Test()
	       public void document1() throws InterruptedException
	       {
	      //back to dashboard
	       d.findElement(By.xpath("//body[1]/app-root[1]/layout-auth[1]/app-step-five[1]/div[1]/div[1]/div[1]/button[1]")).click();
	       Thread.sleep(2000);
	      ///waiting for me
	       d.findElement(By.xpath("//body[1]/app-root[1]/layout-app[1]/div[1]/div[1]/div[1]"
	       		+ "/app-default[1]/div[1]/div[3]/div[1]/div[1]/div[2]")).click();
	       //waiting for others
	       Thread.sleep(2000);
	       d.findElement(By.partialLinkText("Waiting for othe")).click();
	       //Signed document
	       Thread.sleep(2000);
	       d.findElement(By.partialLinkText("Sign")).click();
	       Thread.sleep(2000);
	       //folder
	       d.findElement(By.xpath("//body[1]/app-root[1]/app-layout-document[1]/div[1]/div[1]/app-document-menu[1]"
	       		+ "/div[2]/div[2]/button[1]/i[1]")).click();
	       //Enter folder name
	       d.findElement(By.xpath("//body[1]/modal-container[1]/div[1]/div[1]/app-manage-folder[1]"
	       		+ "/div[1]/form[1]/div[1]/input[1]")).sendKeys("My Folder");
	       //click create
	       d.findElement(By.xpath("//body[1]/modal-container[1]/div[1]/div[1]/app-manage-folder[1]"
	       		+ "/div[1]/div[2]/am-button[1]/button[1]")).click();
	       Thread.sleep(3000);
	       d.findElement(By.linkText("All documents")).click();
	       //view detail
	       d.findElement(By.xpath("//body[1]/app-root[1]/app-layout-document[1]/div[1]/div[1]/div[1]"
	       		+ "/app-document-list[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[4]/div[1]/button[1]")).click();
	       //menu
	       d.findElement(By.xpath("//body[1]/app-root[1]/layout-app[1]/div[1]/div[1]/div[1]"
	       		+ "/app-document-detail[1]/div[2]/div[2]/div[1]/button[1]/i[1]")).click();
	       Thread.sleep(3000);
	       d.findElement(By.partialLinkText("Rena")).click();
	       d.findElement(By.xpath("//body[1]/modal-container[1]/div[1]/div[1]"
	       		+ "/app-rename[1]/div[1]/form[1]/div[1]/input[1]")).clear();
	       d.findElement(By.xpath("//body[1]/modal-container[1]/div[1]/div[1]"
		       		+ "/app-rename[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Data1");
	       d.findElement(By.xpath("//body[1]/modal-container[1]/div[1]/div[1]/app-rename[1]"
	       		+ "/div[1]/div[1]/am-button[1]/button[1]")).click();
	       Thread.sleep(3000);
	       d.findElement(By.xpath("//body[1]/app-root[1]/layout-app[1]/div[1]/div[1]/div[1]"
		       		+ "/app-document-detail[1]/div[2]/div[2]/div[1]/button[1]/i[1]")).click();
	       //delete file
	       d.findElement(By.xpath("//body[1]/app-root[1]/layout-app[1]/div[1]/div[1]/div[1]"
	       		+ "/app-document-detail[1]/div[2]/div[2]/div[1]/div[1]/a[4]/span[1]")).click();
	       Thread.sleep(2000);
	       d.findElement(By.xpath("//body[1]/modal-container[1]/div[1]/div[1]/app-confirmation[1]"
	       		+ "/div[1]/div[2]/am-button[1]/button[1]")).click();
	     }
	       @Test
	       public void signDocument() throws InterruptedException
	       {
	    	   
	    	   //View detail
	    	  d.findElement(By.xpath("//body[1]/app-root[1]/app-layout-document[1]/div[1]/div[1]/div[1]"
	   	       		+ "/app-document-list[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[4]/div[1]/button[1]")).click();
	    	  Thread.sleep(2000);
	    	  //sign button
	    	  d.findElement(By.xpath("//body[1]/app-root[1]/layout-app[1]/div[1]/div[1]/div[1]"
	    	  		+ "/app-document-detail[1]/div[2]/div[2]/button[1]")).click();
	    	  //continue button
	    	  d.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
	    	  //use saved
	    	  d.findElement(By.xpath("//span[contains(text(),'Use saved')]")).click();
	    	  //click on sign
	    	  d.findElement(By.xpath("//body[1]/app-root[1]/layout-auth[1]/app-sign-document-wizard[1]"
	    	  		+ "/app-sign-document-step-one[1]/div[1]/div[2]/div[2]/div[1]/app-document-preview[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-signature-placeholder[1]/div[1]/div[1]")).click();
	    	  

	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	       }
		
		
		
		
	
	
	
	
	
	
	
	
	
	

}

