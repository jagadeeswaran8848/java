import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class upload_file {
    public static void main(String[] args) {
        try{

            Scanner s = new Scanner(System.in);
            System.out.print("Enter the ID : ");
            int id = s.nextInt();
            System.out.print("Enter the file path : ");
            String file_path = s.nextLine();
            File f = new File(file_path);

            FileInputStream fin = new FileInputStream(f);

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jaga","1234");

            PreparedStatement ps = con.prepareStatement("insert into file_data values (?,?)");

            ps.setInt(1,id);
            ps.setBytes(2, fin.readAllBytes());
            int res = ps.executeUpdate();

            if (res > 0) {
                System.out.println("Success");
            }
            fin.close();
            ps.close();
            con.close();
        }catch(Exception obj){
            obj.printStackTrace();
        }
    }
}
