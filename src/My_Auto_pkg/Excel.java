package My_Auto_pkg;
import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class Excel
{
	
	@Test
	public void readExcel() throws Exception
	{
		File file  = new File("D:\\Akshat Nirwan\\Akshat_Automation\\bin\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheetAt(0);
		for(int x=0;x<sh.getLastRowNum()+1;x++)
		{
			Row row = sh.getRow(x);
			for(int y=0;y<row.getLastCellNum();y++)
			{
				try
				{
					Cell cell = row.getCell(y);
					if(cell!=null && cell.getStringCellValue().length()>0)
					{
						System.out.println(cell.getStringCellValue());
				    } 
					
				}
				catch(Exception e)
				{
				}
		   }
        }
		wb.close();
		fis.close();
    }

	public static void main(String[] args) throws Exception
	{
		Excel DT = new Excel();
		DT.readExcel();

	}

}
