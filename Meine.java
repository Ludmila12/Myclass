import java.util.Scanner;

public class Meine {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter s1, s2, s3: ");
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String s3 = s.nextLine();
        System.out.println("s1 + s3 = " + (s1 + s3));
        System.out.println("s3 + s2 + s1 = " + (s3 + s2 + s1));
        System.out.println("s1 + s2 + s3 = " + (s1 + s2 +s3));
        System.out.println("Closing Scanner...");
        s.close();
        System.out.println("Scanner Closed.");
    }
}
