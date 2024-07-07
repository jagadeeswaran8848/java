import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class problem1_files {
    public static void main(String[] args) {
        try {
            File f = new File("C://Users//jagad//OneDrive//Desktop//java_complete_folder//File_IO//java_code_out_files//Problem1_out.txt");
            FileOutputStream fout = new FileOutputStream(f);
        
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter the String : ");

        String m = "tstrdtUDRYDd$E%&35544";

        System.out.print("The List of Choices are : \n1.caps for Captial Ltters\n" + //
                "2.low for Non Captial Ltters\n" + //
                        "3.num for Numbers\n" + //
                                "4.spe for special character");
        System.out.print("\n\nEnter the choice : ");

        String ch = s.nextLine();


        switch (ch) {
            case "caps":
                for (char i : m.toCharArray()) {
                    if(Character.isUpperCase(i)){
                        byte[] by = String.valueOf(i).getBytes();
                        fout.write(by);
                        System.out.print(i+" ");
                    }
                }
                System.out.println("\nSuccess.....");
                break;
            case "low":
                for (char i : m.toCharArray()) {
                    if(Character.isLowerCase(i)){
                        byte[] by = String.valueOf(i).getBytes();
                        fout.write(by);
                        System.out.print(i+" ");
                    }
                }
                System.out.println("\nSuccess.....");

                break;
            case "spe":
                for (char i : m.toCharArray()) {
                    if(!(Character.isLetterOrDigit(i))){
                        byte[] by = String.valueOf(i).getBytes();
                        fout.write(by);
                        System.out.print(i+" ");
                    }
                }
                System.out.println("\nSuccess.....");

                break;
            case "num":
                for (char i : m.toCharArray()) {
                    if(Character.isDigit(i)){
                        byte[] by = String.valueOf(i).getBytes();
                        fout.write(by);
                        System.out.print(i+" ");
                    }
                }
                System.out.println("\nSuccess.....");
                break;
        
            default:
                System.out.println("Invalid choice");
                break;
        }
        fout.close();

        
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}