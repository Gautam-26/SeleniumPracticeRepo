package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelToHashMap 
{
	String path = "\\C:\\Users\\gauta\\Desktop\\TestData.xlsx";
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;


	@Test(dataProvider = "ExcelData")
	public void readData(Map<String,String> testData)
	{
		System.out.print(testData.get("FirstName")+"\t");
		System.out.print(testData.get("LastName")+"\t");
		System.out.print(testData.get("Email")+"\t");
		System.out.println(testData.get("Phone"));

	}

	@DataProvider(name = "ExcelData")
	public Iterator<Object[]> ExcelDataProvider()
	{
		List<Object[]> list = new ArrayList<>();

		try 
		{
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("Sheet1");

			XSSFRow headerRow = sheet.getRow(0);

			for(int i = sheet.getFirstRowNum() + 1; i < sheet.getLastRowNum(); i++)
			{
				Map<String,String> map = new HashMap<>();
				XSSFRow dataRow = sheet.getRow(i);

				for(int j = dataRow.getFirstCellNum(); j < dataRow.getLastCellNum(); j++)
				{
					XSSFCell cell = dataRow.getCell(j);

					switch(cell.getCellType())
					{
					case NUMERIC:
						String data = cell.getNumericCellValue() + "";
						map.put(headerRow.getCell(j).getStringCellValue(), data);
						break;
					case STRING:
						map.put(headerRow.getCell(j).getStringCellValue(),dataRow.getCell(j).getStringCellValue());
						break;

					}

				}
				list.add(new Object[] {map});

			}




		} 
		catch (FileNotFoundException e) 
		{

			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list.iterator();
	}

}
