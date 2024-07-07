import java.io.File;
import java.io.FileReader;
import java.io.FilterReader;

public class filter_reader {
    public static void main(String[] args) {
        try{
        File f = new File("C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//filter_out_st.txt");

        FileReader fr = new FileReader(f);
        
        FilterReader br = new FilterReader(fr){};
        
        int x;

        while ((x=br.read()) !=-1) {
            char ch = (char)x;
            System.out.print(ch);
        }
        fr.close();
    }catch(Exception e){
        e.printStackTrace();
    }
}
}
