import java.io.File;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;


public class sequence_input_stream_sample {
    public static void main(String[] args) {
        try {
            File f1 = new File("C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//Problem1_out.txt");
            File f2 = new File("C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//file_out_st.txt");
            

            FileInputStream fin1 = new FileInputStream(f1);
            FileInputStream fin2 = new FileInputStream(f2);

            Vector<FileInputStream> v = new Vector<>();

            v.add(fin1);
            v.add(fin2);

            Enumeration<FileInputStream> e = v.elements();

            SequenceInputStream se = new SequenceInputStream(e);

            int b;

            while ((b=se.read())!=-1) {
                char ch = (char) b;
                System.out.print(ch);
            }

            se.close();
            fin1.close();
            fin2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
