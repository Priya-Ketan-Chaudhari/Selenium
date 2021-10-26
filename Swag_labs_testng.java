ackage Testng1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class swag_labs
{
	 String driverpath = "/usr/bin/chromedriver";
	 String baseurl = "https://www.saucedemo.com/";
	 public WebDriver driver;
	
  @BeforeTest
public void LaunchBrowser() throws InterruptedException
{   System.out.println("Launch chrome browser");
    System.setProperty("webdriver.chrome.driver",driverpath);
    driver=new ChromeDriver();
    Thread.sleep(2000);
    driver.get(baseurl);
}

    @Test
    public void AutomateswagLabs() throws InterruptedException
    {  
       driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
       Thread.sleep(1000);
   	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
   	   Thread.sleep(1000);
   	   driver.findElement(By.id("login-button")).click();
      String expectedTitle = "Swag Labs";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  System.out.println("User is now on home page of swag labs");
	  Thread.sleep(2000);
	  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("shopping_cart_container")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("checkout")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("first-name")).sendKeys("Priya");
	  Thread.sleep(1000);
	   driver.findElement(By.id("last-name")).sendKeys("Chaudhari");
	   Thread.sleep(1000);
	   driver.findElement(By.id("postal-code")).sendKeys("1234");
	   Thread.sleep(2000);
	   driver.findElement(By.id("continue")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("finish")).click();
	   Thread.sleep(2000);
    }
    @AfterTest
    public void logout() throws InterruptedException
    {driver.findElement(By.id("react-burger-menu-btn")).click();
 	 Thread.sleep(2000);
 	 driver.findElement(By.id("logout_sidebar_link")).click();
 	 System.out.println("User is logged out now");
 	 Thread.sleep(2000);
 	 driver.quit();}
}

