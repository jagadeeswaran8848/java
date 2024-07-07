import java.io.*;

public class CopyPasteJavaWithReader {
    public static void main(String[] args) {
        File src = new File("java_code//sample_video.mp4");
        File des = new File("C://Users//jagad//OneDrive//Desktop//ech//sample2.mp4");

        try {
            FileReader reader = new FileReader(src);
            FileWriter writer = new FileWriter(des);

            char[] buffer = new char[1024];
            int length;

            while ((length = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, length);
            }

            System.out.println("File copied successfully.");
            
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
