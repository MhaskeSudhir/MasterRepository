package excel_Sheet_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Sheet_Study {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\hp\\Documents\\Excel_Apache\\Myfile1.xlsx");
		
		   Sheet cell1 = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		 //System.out.println(cell1);
		 
		 for(int i=0; i<=14; i++) {
			
			 String numvalues = cell1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(numvalues);
		 }
		 
		 for(int i=0; i<=14; i++) {
				  double numvalues1 = cell1.getRow(i).getCell(2).getNumericCellValue();
			System.out.println(numvalues1);
		 }
		 
		 for(int i=0; i<=14; i++) {
			 for(int j=2; j<=3; j++) {
				 double value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(i).getCell(j).getNumericCellValue();
				 System.out.println(value);
			 }
	 }
	}
}

	


