package utilis;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldata
{
	public static String[][] sendData(String Filename) throws IOException
	{
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+Filename+".xlsx");
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int RowCount = ws.getLastRowNum();
		
		int CellCount = ws.getRow(1).getLastCellNum();
		//System.out.println(CellCount);
		
		String[][] Data = new String[RowCount][CellCount];
		
		for (int i = 1; i <= RowCount; i++) 
		{
			XSSFRow row = ws.getRow(i);
			
			for (int j = 0; j < CellCount; j++)
			{
                 String allData = row.getCell(j).getStringCellValue();
                 Data[i-1][j] = allData;
			}
			
		}
		wb.close();
		return Data;
		
		
	}

}
