package excel_Sheet_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Sheet_With_Blank {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\hp\\Documents\\Excel_Apache\\Book100.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
//		System.out.println(mysheet.getRow(0).getCell(0).getCellType());
//		String value = mysheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(value);
//		
//		System.out.println("==========================");
		int rowcount = mysheet.getLastRowNum();
		System.out.println(rowcount);
		
		Row row = mysheet.getRow(rowcount);
		int cellcount = row.getLastCellNum()-1;
		System.out.println(cellcount);
		
		for(int i=0; i<=rowcount; i++) {
			for(int j=0; j<=cellcount; j++) {
				Cell mycell = mysheet.getRow(i).getCell(j);
				CellType type = mycell.getCellType();
				
				if(type==CellType.STRING) {
					System.out.print(mycell.getStringCellValue()+"  | ");
				}
				else if(type==CellType.NUMERIC) {
					System.out.print(mycell.getNumericCellValue()+"  | ");
				}
				else if(type==CellType.BOOLEAN) {
					System.out.print(mycell.getBooleanCellValue()+"  | ");
				}
				else if(type==CellType.BLANK) {
					System.out.print("---  | ");
				}
				}
			System.out.println();
		}

	}

}
