package selenium_Akshat;
//import java.io.IOException;
//import org.apache.poi.xssf.usermodel.*;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;


public class Create_Workbook {

	public static void main(String[] args) throws Exception
	{
		//creating a blank workbook	object
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//creating file system using specific name
		FileOutputStream out = new FileOutputStream(new File("my_workbook.xlsx"));
		
		//write operation on workbook using file out object
		workbook.write(out);
		out.close();
		//workbook.close();
		System.out.println("my_workbook.xlsx written successfully");

	}

}
