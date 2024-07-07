import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class filter_out {
      public static void main(String[] args) {
        try {
            
            File f = new File("C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//filter_out_st.txt");
            FileOutputStream fout = new FileOutputStream(f);

            FilterOutputStream fiout  = new FilterOutputStream(fout);
            String m = "Filter output Stream";
            byte[] by = m.getBytes();
            fiout.write(by);
            fiout.close();

            System.out.println("Success.....");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
