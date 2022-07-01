package excel_Sheet_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Reading_Example4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\hp\\Documents\\Excel_Apache\\Myfile2.xlsx");
		
		Workbook file = WorkbookFactory.create(myfile);
		Sheet sheet = file.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		int rownum = sheet.getLastRowNum();
		System.out.println(rownum);
		short cellsnum = row.getLastCellNum();
		System.out.println(cellsnum);
		System.out.println("===============================");
		
		 int totalnumofrows = rownum;
		 int totalnumofcell = cellsnum-1;
		 
		 for(int i=0; i<=totalnumofrows; i++) {
			 for(int j=0; j<=totalnumofcell; j++) {
				 double value = sheet.getRow(i).getCell(j).getNumericCellValue();
				 System.out.print(value+"  ");
			 }
			 System.out.println();
		 }
		

		
	}

}
