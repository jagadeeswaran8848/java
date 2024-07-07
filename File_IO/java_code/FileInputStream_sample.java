import java.io.*;

public class FileInputStream_sample {
    public static void main(String[] args) {
        try {

            File f = new File("C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//file_input_stream.txt");
            FileInputStream fin = new FileInputStream(f);

            int b;

            while ((b = fin.read())!=-1) {
                char ch = (char)b;
                System.out.print(ch);
            }

            fin.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
