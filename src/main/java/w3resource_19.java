import java.util.Scanner;

public class w3resource_19 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();
        System.out.println(Integer.toBinaryString(i));
        sc.close();
    }
}
