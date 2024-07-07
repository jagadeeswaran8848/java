import java.io.File;
import java.io.FileOutputStream;

/**
 * file_output_stream
 */
public class file_output_stream {

    public static void main(String[] args) {
        try {
            
            File f = new File("C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//file_out_st.txt");
            FileOutputStream fout = new FileOutputStream(f);
            String m = "File output Stream";

            byte[] by = m.getBytes();
            fout.write(by);
            fout.close();

            System.out.println("Success.....");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}