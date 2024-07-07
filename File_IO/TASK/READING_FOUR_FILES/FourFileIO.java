import java.io.*;

public class FourFileIO {
    public static void main(String[] args) {
        try {
            String[] fileNames = {
                "C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//java1.txt",
                "C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//java2.txt",
                "C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//java3.txt",
                "C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//java4.txt"
            };

            for (String fileName : fileNames) {
                String fileNameOnly = new File(fileName).getName();
                
                System.out.println("File: " + fileNameOnly); 
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
