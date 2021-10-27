package rorbotdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiondemo
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
      a1.sendKeys(user, "standard_user").build().perform();
      Thread.sleep(1000);
      WebElement psw=driver.findElement(By.id("password"));
      a1.sendKeys(psw, "secret_sauce").build().perform();
      Thread.sleep(1000);
      WebElement login =driver.findElement(By.id("login-button"));
      a1.click(login).build().perform();
      Thread.sleep(1000);
      WebElement product1=driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
      a1.click(product1).build().perform();
      Thread.sleep(1000);
      WebElement cart=driver.findElement(By.id("shopping_cart_container"));
      a1.click(cart).build().perform();
      Thread.sleep(2000);
      WebElement checkout=driver.findElement(By.id("checkout"));
      a1.click(checkout).build().perform();
      Thread.sleep(2000);
      WebElement name=driver.findElement(By.id("first-name"));
      a1.sendKeys(name,"Priya").build().perform();
      Thread.sleep(1000);
      WebElement lastname= driver.findElement(By.id("last-name"));
      a1.sendKeys(lastname,"Chaudhari").build().perform();
      Thread.sleep(1000);
      WebElement pcod= driver.findElement(By.id("postal-code"));
      a1.sendKeys(pcod,"2345").build().perform();
      Thread.sleep(1000);
      WebElement Continue=driver.findElement(By.id("continue"));
      a1.click(Continue).build().perform();
      Thread.sleep(1000);
      WebElement finish=driver.findElement(By.id("finish"));
      a1.click(finish).build().perform();
      Thread.sleep(2000);
      WebElement menu=driver.findElement(By.id("react-burger-menu-btn"));
      a1.click(menu).build().perform();
      Thread.sleep(2000);
      WebElement logout=driver.findElement(By.id("logout_sidebar_link"));
      a1.click(logout).build().perform();
      Thread.sleep(2000);
      driver.quit();
      
	}
}

