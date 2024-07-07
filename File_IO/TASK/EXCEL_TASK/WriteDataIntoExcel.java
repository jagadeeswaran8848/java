package excel;

import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("E://!Excel_files_java//sample1.xlsx");
			
			FileInputStream fin = new FileInputStream(f);
			
			
			
			XSSFWorkbook xb = new XSSFWorkbook(fin);
			
			XSSFSheet xs = xb.getSheet("MCU");
			
			XSSFRow r = xs.getRow(0);
			
			XSSFCell c = r.getCell(0);
			
			
			
			
			switch (c.getCellType()){
			case Cell.CELL_TYPE_STRING: 
				String res1 = c.getStringCellValue();
				
				System.out.print(res1);
				break;
				
			case Cell.CELL_TYPE_NUMERIC: 
				double res2 = c.getNumericCellValue();
				
				System.out.print(res2);
				break;
			
			}
			
			fin.close();
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
