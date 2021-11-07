package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataReader 
{

	String path = "\\C:\\Users\\gauta\\Desktop\\TestData.xlsx";

	XSSFWorkbook workbook;
	XSSFSheet sheet;


	@Test
	public void readData()
	{
		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);

			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("Sheet1");

			for(int i = sheet.getFirstRowNum(); i < sheet.getLastRowNum(); i++)
			{
				XSSFRow row = sheet.getRow(i);

				for(int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++)
				{
					XSSFCell cell = row.getCell(j);

					switch(cell.getCellType())
					{
					case NUMERIC:
						System.out.print(cell.getNumericCellValue()+"\t");
						break;
					case STRING:
						System.out.print(cell.getStringCellValue()+ "\t");
						break;


					}

				}
				System.out.println();


			}


		}
		catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
