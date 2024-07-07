import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class buffered_out {
    public static void main(String[] args) {
        try {
            
            File f = new File("C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//buffered_out_st.txt");
            FileOutputStream fout = new FileOutputStream(f);

            BufferedOutputStream bout  = new BufferedOutputStream(fout);
            String m = "Buffer output Stream";
            byte[] by = m.getBytes();
            bout.write(by);
            bout.close();

            System.out.println("Success.....");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
