package testing.Exceldatadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("E:\\Exel45\\abc.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet	sheet=workbook.getSheet("testdata");
	int rowcount=sheet.getLastRowNum();
	int colcout=sheet.getRow(0).getLastCellNum();
	for(int i=0;i<rowcount;i++)
	{
		XSSFRow current=sheet.getRow(i);
		for(int j=0;j<colcout;j++)
		{
			String value=current.getCell(j).toString();
			System.out.print(value);
			
		}
	System.out.println();
	}
		
		
		
		
}}
