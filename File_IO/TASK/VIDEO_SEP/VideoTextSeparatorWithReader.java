import java.io.*;

public class VideoTextSeparatorWithReader {
    public static void main(String[] args) {
        File src = new File("java_code//sample_video.mp4"); 
        File utf8File = new File("utf8_text.txt");
        File utf16File = new File("utf16_text.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(src));
             BufferedWriter utf8Writer = new BufferedWriter(new FileWriter(utf8File));
             BufferedWriter utf16Writer = new BufferedWriter(new FileWriter(utf16File))) {

            String line;
            while ((line = reader.readLine()) != null) {
                separateAndWriteText(line, utf8Writer, utf16Writer);
            }

            System.out.println("Separation and writing completed successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void separateAndWriteText(String line, BufferedWriter utf8Writer, BufferedWriter utf16Writer) throws IOException {
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (isUTF8Character(c)) {
                utf8Writer.write(c);
            } else if (isUTF16Character(c)) {
                utf16Writer.write(c);
            }
        }
        utf8Writer.newLine();
        utf16Writer.newLine();
    }

    private static boolean isUTF8Character(char c) {
        try {
            byte[] bytes = String.valueOf(c).getBytes("UTF-8");
            return bytes.length == 1;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean isUTF16Character(char c) {
        try {
            byte[] bytes = String.valueOf(c).getBytes("UTF-16");
            return bytes.length > 2; 
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        }
    }
}
