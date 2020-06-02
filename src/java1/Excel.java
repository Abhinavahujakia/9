package java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f =new File("E:\\type\\Abhinav.xlsx)");
		
			
		FileInputStream f1=new FileInputStream(f);
	
		
	
		Workbook wo =new WorkbookFactory().create(f1);
		Sheet sheet0=wo.getSheetAt(0);
		Row rows=sheet0.getRow(0);
		Cell cel=rows.getCell(0);
		
		System.out.println(cel);
		
		f1.close();
	
	
	


}}
