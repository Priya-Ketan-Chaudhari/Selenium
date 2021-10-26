package excelsdemo;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo
{
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public ExcelDemo(String excelpath, String sheetname) throws IOException
	{
		workbook=new XSSFWorkbook(excelpath);
	    sheet =workbook.getSheet(sheetname);
	}
	
	public static void main(String[]args)
	{     getrowcount();
	      getDataUsernameString(1,0);
	      getDataPassword(1,1); 
	}
	      
		public static void getrowcount()
	{  
		int count=sheet.getPhysicalNumberOfRows();
		System.out.println("The total count of row ="+count);
		
	}
	
	public static void getDataUsernameString(int rownum,int colnum)
	{  
		String datausr= sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	    System.out.println("The data in the excel file for username="+datausr);
	}
	
	public static void getDataPassword(int r1,int c1)
	{  
		String datapsw= sheet.getRow(r1).getCell(c1).getStringCellValue();
	    System.out.println("The data in the excel file for password="+datapsw);
	}
}

//New class in which const is created

package excelsdemo;
import java.io.IOException;

public class ExcelCall
{
	public static void main(String[] args) throws IOException
	{
		String path=System.getProperty("user.dir");
		ExcelDemo ex = new ExcelDemo(path+"/excels/data.xlsx", 
				                      "sheet1");
		ex.getrowcount();
		ex.getDataUsernameString(1,0);
		ex.getDataPassword(1,1); 
	}
}

