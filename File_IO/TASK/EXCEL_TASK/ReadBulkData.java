package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadBulkData {
	

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\jagad\\eclipse-workspace\\excel\\src\\excel\\Student_details.xlsx");
			
			FileInputStream fin = new FileInputStream(f);
			
			XSSFWorkbook wb = new XSSFWorkbook(fin);
			
			Sheet s = wb.getSheetAt(0);
			
			for(Row r:s) {
				for(Cell c:r) {
					switch (c.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						System.out.print(c.getStringCellValue()+"\t");
						break;
						
					case Cell.CELL_TYPE_NUMERIC:
						if(DateUtil.isCellDateFormatted(c)) {
							System.out.print(c.getDateCellValue()+"\t");
						}else {
						System.out.print(c.getNumericCellValue()+"\t");
						}
						break;
						
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.print(c.getBooleanCellValue()+"\t");
						break;
						
					case Cell.CELL_TYPE_FORMULA:
						System.out.print(c.getCellFormula()+"\t");
						break;
						
					default:
						System.out.print("\t");
						break;
					}
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
