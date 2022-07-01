package excel_Sheet_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Sheet_Practice1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\hp\\Documents\\Excel_Apache\\Book1.xlsx");
		
		   Sheet cell1 = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		 //System.out.println(cell1);
		 
		 for(int i=0; i<=24; i++) {
			double numvalues = cell1.getRow(i).getCell(0).getNumericCellValue();
			System.out.println(numvalues);
		 }
//		 for(int i=0; i<=3; i++) {
//				 String numvalues1 = cell1.getRow(i).getCell(4).getStringCellValue();
//				System.out.println(numvalues1);
//			 }
	}

}
