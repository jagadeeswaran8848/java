import java.io.*;

public class BufferedInputStream_sample {
    public static void main(String[] args) {
        try {
            File f = new File("C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//file_input_stream.txt");
            FileInputStream fin = new FileInputStream(f);
            BufferedInputStream bin = new BufferedInputStream(fin);

            int b;

            while ((b = bin.read()) != -1) {
                char ch = (char) b;
                System.out.print(ch);
            }

            bin.close();
            fin.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
