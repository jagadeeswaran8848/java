import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class sample {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\jagad\\OneDrive\\Desktop\\New folder\\sample.xlsx");

            FileInputStream fin = new FileInputStream(f);


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
