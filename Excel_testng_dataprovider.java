package excelsdemo;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelCall_TestNG
{
	String driverpath = "/usr/bin/chromedriver";
	String baseurl = "https://www.saucedemo.com/";
    public WebDriver driver;
    
	@BeforeTest
	public void LaunchBrowser() throws InterruptedException
    {   
	System.out.println("Launch chrome browser");
    System.setProperty("webdriver.chrome.driver",driverpath);
    driver=new ChromeDriver();
    Thread.sleep(1000);
    }
	
	@Test(dataProvider="test")
	public void test1(String Useraname, String Password) throws InterruptedException
	{
		System.out.println("Username is "+ Useraname +" And Password is "+ Password);
		driver.get(baseurl);
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys(Useraname);
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(1000);
	}

    @DataProvider(name="test")
	public Object[][] dataProvider() throws IOException
	{
    	 String path=System.getProperty("user.dir");
	     Object Data[][]=testData(path+"/excels/data.xlsx","Sheet1");
	     return Data;
	 }
    
	public Object[][] testData(String excelpath, String sheetname) throws IOException
	{
	    ExcelDataProvider ex = new ExcelDataProvider(excelpath,sheetname);
		int rowCount=ex.getrowcount();
		int colcount=ex.getcolcount();
		Object Data[] []= new Object[rowCount-1][colcount];
		for(int i=1; i<rowCount; i++)
		{
			for(int j=0; j<colcount; j++)
			{
				String cellData= ex.getData(i,j);
				Data[i-1][j]=cellData;
			}
		}
		return Data;
		}
	
      @AfterTest
      public void closeBrowser()
      { 
	    driver.quit();
      }
}

//DataProviderClass//


package excelsdemo;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider
{
	static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    public ExcelDataProvider(String path, String sheetname) throws IOException
    {
	   workbook=new XSSFWorkbook(path);
       sheet =workbook.getSheet(sheetname);
    }

    public static void main(String[]args)
    {
    	getrowcount();
    	getcolcount();
    }
    public static int getrowcount()
	{  
		int rcount=sheet.getPhysicalNumberOfRows();
		System.out.println("The total count of row ="+rcount);
		return rcount;
		
	}
    public static int getcolcount()
	{  
		int Ccount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("The total count of column ="+Ccount);
		return Ccount;
		
	}
    public static String getData(int rownum,int colnum)
	{  
		String datausr= sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	    return datausr;
	}

}




