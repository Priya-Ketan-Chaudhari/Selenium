package Com.Swag_Labs;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class swag_labs1 {
    public static void main(String []args) throws  InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/am-pc-37/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
      
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
       
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        WebElement login=driver.findElement(By.id("login-button"));
        Thread.sleep(2000);
        login.click();
        String actualUrl="https://www.saucedemo.com/inventory.html";
        String expectedUrl= driver.getCurrentUrl();
        if(actualUrl.equalsIgnoreCase(expectedUrl))
        {  System.out.println("Login is Successfull");}
        else 
        {  System.out.println("Login is not successfull");}
       
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("Priya");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Chaudhari");
        Thread.sleep(1000);
        driver.findElement(By.name("postalCode")).sendKeys("4255");
        Thread.sleep(1000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(1000);
        String actualUrl1="https://www.saucedemo.com/checkout-complete.html";
        String expectedUrl1= driver.getCurrentUrl();
        if(actualUrl1.equalsIgnoreCase(expectedUrl1))
        { System.out.println("Checkout is completed");}
        else 
        { System.out.println("Checkout is not completed");}
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}