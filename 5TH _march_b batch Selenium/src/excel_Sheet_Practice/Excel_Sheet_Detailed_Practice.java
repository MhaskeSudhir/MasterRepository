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

public class Excel_Sheet_Detailed_Practice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\hp\\Documents\\Excel_Apache\\Myfile1.xlsx");
		
		//String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		//System.out.println(value);
		
//		Split each and every step
		
		Workbook file = WorkbookFactory.create(myfile);
		Sheet sheet = file.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		CellType celltype = cell.getCellType();
		System.out.println(celltype);
		//System.out.println(cell.getCellStyle());
		//System.out.println(cell.getCellFormula());
		
		String value = cell.getStringCellValue();
		System.out.println(value);
		System.out.println("==============================");
		
		for(int i=0; i<=14; i++) {
			String value1 = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value1);
		}
		System.out.println("+++=++++++++++++++++++++++++++++++++++");
		
		for(int i=0; i<=14; i++) {
			for(int j=0; j<=1; j++) {
				String value2 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value2+"    ");
			}
			System.out.println();
		}
		System.out.println("##################################");
		
		short lastcellnum = row.getLastCellNum();
		int totalcellcount = lastcellnum-1;
		System.out.println(totalcellcount);
		
		int totalrowcount = sheet.getLastRowNum();
		System.out.println(totalrowcount);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		for(int i=0; i<=totalrowcount; i++) {
			for(int j=0; j<=totalcellcount; j++) {
				String value3 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value3+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
