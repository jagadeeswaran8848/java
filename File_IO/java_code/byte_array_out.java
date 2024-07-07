import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class byte_array_out {
      public static void main(String[] args) {
        try {
            
            

            ByteArrayOutputStream bis = new ByteArrayOutputStream();

            String m = "File output Stream";
            byte[] by = m.getBytes();
            bis.write(by);
            bis.close();

            File f1 = new File("C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//byte_array_out_st.txt");
            File f2 = new File("C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//byte_array_out_st.doc");
            FileOutputStream fout1 = new FileOutputStream(f1);
            FileOutputStream fout2 = new FileOutputStream(f2);

            bis.writeTo(fout1);
            bis.writeTo(fout2);

            System.out.println("Success.....");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
