import java.util.Scanner;
import java.sql.*;

public class oracle_sample1 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the Work (select or insert) : ");
            String ch = s.nextLine();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jaga", "1234");



                if (ch.equals("insert")) {
                    PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");

                    String User_ch = "";


                    do {
                        System.out.println("Enter employee id:");
                        String id = s.nextLine();

                        System.out.println("Enter employee name:");
                        String name = s.nextLine();

                        System.out.println("Enter employee salary:");
                        int sal = s.nextInt();

                        System.out.println("Enter employee experience:");
                        int exp = s.nextInt();

                        s.nextLine();

                        ps.setString(1, id);
                        ps.setString(2, name);
                        ps.setInt(3, sal);
                        ps.setInt(4, exp);

                        int res = ps.executeUpdate();

                        if (res > 0) {
                            System.out.println("Success");
                        }

                        System.out.println("\n\nYes means wants to add data\nNo means to exit the application\nEnter the Choice (yes or no) : ");
                        User_ch = s.nextLine();
//
                    } while (User_ch.equals("yes"));
                } else if (ch.equals("select")) {
                    Statement st = con.createStatement();
                    ResultSet res = st.executeQuery("select * from employee");
                    while (res.next()) {
                        String id = res.getString(1);
                        String name = res.getString(2);
                        String salary = res.getString(3);
                        String exp = res.getString(4);

                        System.out.println("ID : " + id + " Name : " + name + " salary : " + salary + " exp : " + exp);
                    }

                }


            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
