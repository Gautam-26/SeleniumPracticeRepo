package rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderDemo {

	public static void main(String[] args) throws IOException 
	{

		List<Map<String,String>> list =	readDataFromExcel();
		
		for(Map<String,String> map : list)
		{
			System.out.println(map.get("FirstName"));
		}

		
	}

	private static List<Map<String,String>> readDataFromExcel() throws FileNotFoundException, IOException 
	{

		List<Map<String,String>> list = new ArrayList<>();

		File file = new File("C:\\Users\\gauta\\Desktop\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		Map<String,String> mapdata;
		for(int i = 0; i <= sheet.getLastRowNum(); i++)
		{
			XSSFRow row = sheet.getRow(i);
			mapdata = new HashMap<>();

			for(int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++)
			{
				XSSFCell cell = row.getCell(j);

				switch(cell.getCellType())
				{
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "");
					String val =cell.getNumericCellValue() + "";
					mapdata.put(sheet.getRow(0).getCell(j).getStringCellValue(),val );
					break;
				case STRING:
					System.out.print(cell.getStringCellValue()+" ");
					mapdata.put(sheet.getRow(0).getCell(j).getStringCellValue(),cell.getStringCellValue() );
					break;
				}
			}
			list.add(mapdata);

			System.out.println();
		}

		return list;
	}

}
