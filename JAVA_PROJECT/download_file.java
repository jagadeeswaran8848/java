import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;

public class download_file {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jaga","1234");

            Statement sta = con.createStatement();

            ResultSet res = sta.executeQuery("select * from file_data");

            int pos = 0;
            while(res.next()){
                Blob b = res.getBlob("filedata");
                byte[]by=b.getBytes(++pos,(int)b.length());
                java.util.Random r = new java.util.Random();
                int ran = r.nextInt(10000);
                File f = new File("C:\\Users\\jagad\\OneDrive\\Desktop\\File"+ran+".docx");
                FileOutputStream fout = new FileOutputStream(f);

                fout.write(by);

                fout.close();

            }
            System.out.print("Success....");
        }catch(Exception obj){
            obj.printStackTrace();
        }
    }
}
