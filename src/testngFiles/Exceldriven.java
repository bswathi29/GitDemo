package testngFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldriven {

	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String value;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String value1=getCellData(2,2);
		System.out.println(value1);
		setCellData("done",1,2);
		
	}
	
	public static String getCellData(int row1, int col1) throws IOException
	{
		
		FileInputStream fis=new FileInputStream("C:\\Swathi\\Data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(row1);
		XSSFCell cell=row.getCell(col1);
		value=cell.getStringCellValue();
		//System.out.println(value);
		return value;
	}
	
	public static void setCellData(String text, int row2, int col2) throws IOException
	{
		System.out.println(text);
		System.out.println(row2);
		System.out.println(col2);
		FileInputStream fis=new FileInputStream("C:\\Swathi\\Data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(row2);
		XSSFCell cell=row.getCell(col2);
		System.out.println(cell.getStringCellValue());
		cell.setCellValue(text);
	}

}
