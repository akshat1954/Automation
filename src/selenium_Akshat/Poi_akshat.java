package selenium_Akshat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Poi_akshat
{
	public void readExcel(String filePath, String fileName, String sheetName) throws IOException
	{
		//creating an object of file class to open xlsx file 
		File file = new File(filePath+ "\\D:\\" +fileName);
		
		//create an object of FileInpurStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook akshat_workbook = null;
		
		//find the file extension by splitting  file name in substring  and getting only extension name
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		
		//check condition if the file is xls file
		if(fileExtensionName.equals(".xls"))
		{
			// if it is xls file then create object of XSSFWorkbook class
			XSSFWorkbook akshat_workbook1 = new XSSFWorkbook(inputStream);
			
		}
		
		//read sheet inside the workbook by its name
		Sheet akshat_sheet = akshat_workbook.getSheet(sheetName);
		
		// find number of rows in excel file
		int rowCount = akshat_sheet.getLastRowNum()-akshat_sheet.getFirstRowNum();
		
		//create a loop over all excel rows to read the data 
		for(int i = 0; i < rowCount+1; i++)
		{
			Row row = akshat_sheet.getRow(i);
			
			// create a row to print cell values in a row
			for(int j=0; j<row.getLastCellNum(); j++)
			{
				// print excel data in console 
				System.out.println(row.getCell(j).getStringCellValue()+"|| ");
				
			}
			
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) 
	{
	// creating an object of Poi_akshat class
		Poi_akshat objExcelFile = new Poi_akshat();
		
		//preparing the path of excel file
		String filePath = System.getProperty("user.dir")+"\\";
		
		//call read file method of the class to read the data 
		try {
			objExcelFile.readExcel(filePath,"akshat123","akshat_sheet");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
