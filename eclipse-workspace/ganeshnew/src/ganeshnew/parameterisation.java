package ganeshnew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterisation {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\Downloads\\demoxcel\\demo.xlsx");
		
		String result = WorkbookFactory.create(file).getSheet("login").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(result);
		


	}

}
