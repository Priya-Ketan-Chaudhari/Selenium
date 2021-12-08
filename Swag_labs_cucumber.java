package StepDefination;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class swag_labs_Steps
{
	public WebDriver driver= new ChromeDriver(); //public WebDriver driver= null;
	String driverpath="/usr/bin/chromedriver";
	String baseurl="https://www.saucedemo.com/inventory.html";
	
	@Given("open login page to the user")
	public void open_login_page_to_the_user() throws InterruptedException
	{System.out.println("User is on login page now");//System.setProperty("webdriver.chrome.driver","/home/am-pc-37/Downloads/chromedriver_linux64/chromedriver");
		                                         //driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);}
	
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() throws InterruptedException
	{driver.findElement(By.id("user-name")).sendKeys("standard_user"); Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");     Thread.sleep(1000);
	driver.findElement(By.id("login-button")).click();
	String actualUrl=baseurl;
    String expectedUrl= driver.getCurrentUrl();
    if(actualUrl.equalsIgnoreCase(expectedUrl))
    {  System.out.println("***Login is Successfull***");}
    else 
    {  System.out.println("***Login is not successfull***");}}

	@Then("user is navigated to the home page of swag labs")
	public void user_is_navigated_to_the_home_page_of_swag_labs() throws InterruptedException
	{System.out.println("User is now on home page of swag labs");
	Thread.sleep(2000);}
	
	@Given("user is on home page of swag labs")
	public void user_is_on_home_page_of_swag_labs()
	{}

	@And("user add a product in the cart")
	public void user_add_a_product_in_the_cart() throws InterruptedException
	{System.out.println("user is navigting the products");
	driver.manage().window().maximize();
	Thread.sleep(2000);}

	@When("user click on the add to cart button")
	public void user_click_on_the_add_to_cart_button() throws InterruptedException
	{driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();  Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();}
	
	@Then("product is added to cart")
	public void product_is_added_to_cart() throws InterruptedException
	{System.out.println("Products are added to cart");
	Thread.sleep(2000);}
	
	@When("user clicks on cart button")
	public void user_clicks_on_cart_button()
	{  driver.findElement(By.id("shopping_cart_container")).click();
	}
	
	@Then("user is navigated to cart page")
	public void user_is_navigated_to_cart_page()
	{ String actualUrl="https://www.saucedemo.com/cart.html";
	String expectedUrl= driver.getCurrentUrl();
	if(actualUrl.equalsIgnoreCase(expectedUrl))
    {  System.out.println("***Cart page is open***");}
    else 
    {  System.out.println("***Cart page is not open***");}}

	@And("user continue to the place order")
	public void user_continue_to_the_place_order() throws InterruptedException 
	{Thread.sleep(3000);}

	@When("user click on checkout button")
	public void user_click_on_checkout_button() throws InterruptedException
	{  driver.findElement(By.id("checkout")).click();
	Thread.sleep(1000);}

	@Then("user is navigated to checkout page")
	public void user_is_navigated_to_checkout_page() throws InterruptedException
	{  String actualUrl="https://www.saucedemo.com/checkout-step-one.html";
	String expectedUrl= driver.getCurrentUrl();
	if(actualUrl.equalsIgnoreCase(expectedUrl))
    {  System.out.println("***Checkout page is open now***");}
    else 
    {  System.out.println("***Checkout page is not open***");}
	Thread.sleep(1000);}

	@When("user enters necessary info")
	public void user_enters_necessary_info() throws InterruptedException
	{  driver.findElement(By.id("first-name")).sendKeys("Priya");  Thread.sleep(1000);
	   driver.findElement(By.id("last-name")).sendKeys("Chaudhari");  Thread.sleep(1000);
	   driver.findElement(By.id("postal-code")).sendKeys("1234");  Thread.sleep(2000);
	}

	@And("clicks on the continue button")
	public void clicks_on_the_continue_button() throws InterruptedException
	{ driver.findElement(By.id("continue")).click();
	Thread.sleep(1000);}

	@Then("order is prepared for placed")
	public void order_is_prepared_for_placed()
	{  System.out.println("Your order is ready to be placed now");}
	
	@When ("user clicks on finish button")
	public void user_clicks_on_finish_button()
	{  driver.findElement(By.id("finish")).click();}

	@Then ("your order is totally placed")
	public void your_order_is_totally_placed() throws InterruptedException
	{String actualUrl="https://www.saucedemo.com/checkout-complete.html";
	String expectedUrl= driver.getCurrentUrl();
	if(actualUrl.equalsIgnoreCase(expectedUrl))
    {  System.out.println("***Order is placed successfully***");}
    else 
    {  System.out.println("***Order is not placed successfully****");}
    Thread.sleep(2000);}
	
	@When("user click on logout button")
	public void user_click_on_logout_button() throws InterruptedException
	{ driver.findElement(By.id("react-burger-menu-btn")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("logout_sidebar_link")).click();
	  Thread.sleep(2000);
	  }
	@Then("user is logged out")
	public void user_is_logged_out()
	{  System.out.println("User is logged out now");
	   driver.quit();}
	}



	

