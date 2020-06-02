package java1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class hello {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet0= workbook.createSheet("Firstsheet");
		
     
		Row row0=sheet0.createRow(0);
		
     Cell celA=row0.createCell(0);
     Cell celB=row0.createCell(1);
     Cell celc=row0.createCell(2);
     
     celA.setCellValue("F");
     celB.setCellValue("secon");
     celc.setCellValue("Testing");
     
     
     
     
     File f =new File("E:\\type\\my.xlsx");
     FileOutputStream  fs =new FileOutputStream(f);
     
     workbook.write(fs);
     fs.close();
	}
}
