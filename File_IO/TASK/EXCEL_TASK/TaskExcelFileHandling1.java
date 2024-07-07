package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TaskExcelFileHandling1 {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\jagad\\eclipse-workspace\\excel\\src\\excel\\Student_details.xlsx");
            FileInputStream fin = new FileInputStream(f);
            XSSFWorkbook wb = new XSSFWorkbook(fin);
            Sheet s = wb.getSheetAt(0);

            int lc = s.getRow(0).getLastCellNum();

            Row hr = s.getRow(0);
            hr.createCell(lc).setCellValue("Total");
            hr.createCell(lc+1).setCellValue("Average");
            hr.createCell(lc+2).setCellValue("Status");

            for (int i = 1; i <= s.getLastRowNum(); i++) { // Start from 1 to skip header row
                Row r = s.getRow(i);
                if (r == null) {
                    continue;
                }

                double tot = 0;
                boolean isFail = false;

                for (int j = 4; j < lc; j++) {
                    Cell c = r.getCell(j);
                    if (c != null && c.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                        double mark = c.getNumericCellValue();
                        tot += mark;
                        if (mark < 35) {
                            isFail = true;
                        }
                    }
                }
                double avg = tot / (lc - 4);
                r.createCell(lc).setCellValue(tot);
                r.createCell(lc + 1).setCellValue(avg);
                r.createCell(lc + 2).setCellValue(isFail ? "FAIL" : "PASS");
            }

            try (FileOutputStream fout = new FileOutputStream("C:\\Users\\jagad\\OneDrive\\Desktop\\Student_Final.xlsx")) {
                wb.write(fout);
            }

            System.out.println("Process completed successfully. Student details updated.");
            
            fin.close(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
