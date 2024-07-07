import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPasteJava {
    public static void main(String[] args) {
        File src = new File("java_code//sample_video.mp4");
        File des = new File("C://Users//jagad//OneDrive//Desktop//ech//sample1.mp4");

        

        try {
            FileInputStream fin = new FileInputStream(src);
            FileOutputStream fout = new FileOutputStream(des);

            byte[] buffer = new byte[1024]; 
            int length;

            while ((length = fin.read(buffer)) > 0) {
                fout.write(buffer, 0, length);
            }

            System.out.println("File copied successfully.");
            fin.close();;
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
            
    }
}
