package ganeshnew;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 class p2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\Downloads\\demoxcel.xlsx");
		
		Workbook book = WorkbookFactory.create(file);
		
              Sheet sh = book.getSheet("login");
              Row rh = sh.getRow(0);
              Cell cl = rh.getCell(0);
              String value = cl.getStringCellValue();
              System.out.println("value");
	}

}
