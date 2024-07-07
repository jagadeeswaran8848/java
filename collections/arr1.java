import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        int n[] = new int[3];
        n[0] =100;
        n[1] = 300;
        System.out.println(n.length);

        int c=4;
        String str[] = new String[c]; 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String : \n");
        for (int i = 0; i < c; i++) {
        str[i] = s.nextLine();    
        }
        System.out.println("\nOutput : \n");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
