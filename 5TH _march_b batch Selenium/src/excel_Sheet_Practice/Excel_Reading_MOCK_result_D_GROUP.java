package excel_Sheet_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Reading_MOCK_result_D_GROUP {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\hp\\Documents\\Excel_Apache\\GroupD.xlsx");
		
		  Workbook file = WorkbookFactory.create(myfile);
		  Sheet mysheet = file.getSheet("Sheet1");
		  Row myrow = mysheet.getRow(0);
		  Cell cell = myrow.getCell(0);
		
		int totalrowcount = mysheet.getLastRowNum();
		System.out.println(totalrowcount);
		
		int totalcellcount = mysheet.getRow(0).getLastCellNum()-1;
		System.out.println(totalcellcount);
		
		for(int i=0; i<=totalrowcount; i++) {
			for(int j=0; j<=totalcellcount; j++) {
				Cell mycell = mysheet.getRow(i).getCell(j);
				CellType type = mycell.getCellType();
				
				if(type==CellType.STRING) {
					System.out.print(mycell.getStringCellValue()+" | ");
				}
				else if(type==CellType.BOOLEAN) {
					System.out.print(mycell.getBooleanCellValue()+" | ");
				}
				else if(type==CellType.NUMERIC) {
					System.out.print(mycell.getNumericCellValue()+" | ");
				}
				else if(type==CellType.BLANK) {
					System.out.println("-----");
				}
				
			}
			System.out.println();
		}

	}

}
