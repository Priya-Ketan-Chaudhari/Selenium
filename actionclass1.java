package robotdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class actionclass1
{
	 static String driverpath="/usr/bin/chromedriver";
	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver= new ChromeDriver();
      System.setProperty("Webdriver.chrome.driver", driverpath);
      driver.get("https://www.saucedemo.com/");
      Thread.sleep(1000);
      Actions a1=new Actions(driver);
      WebElement user = driver.findElement(By.id("user-name"));
      Thread.sleep(1000);
      WebElement psw=driver.findElement(By.id("password"));
      Thread.sleep(1000);
      WebElement login =driver.findElement(By.id("login-button"));
      Thread.sleep(1000);
       Action seriesofActions;
      seriesofActions=a1
    		  .sendKeys(user,"standard_user")
    		  .sendKeys(psw,"secret_sauce")
    		  .keyDown(login,Keys.SHIFT)
              .keyUp(login,Keys.SHIFT)
              .build();
              seriesofActions.perform();
              Thread.sleep(2000);
              driver.navigate().refresh();
              
             /* for(int i=0;i<10;i++)
              {
            	  try {
              driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
              break;
            	  }
            	  catch(StaleElementReferenceException e) {}
              /*Action seriesofActions1;
              seriesofActions1=a1
                      .keyDown(p1,Keys.SHIFT)
                      .keyUp(p1,Keys.SHIFT)
                      .build();
              seriesofActions1.perform();*/
       }
    }
         
              
              
              
              
     
