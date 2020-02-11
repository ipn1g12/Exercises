public class w3resource_26 {
    public static void main(String[] args) {
        String a = "7";
        int b = Integer.parseInt(a,8);
        String c = Integer.toBinaryString(b);
        System.out.println("Octal number is: " +b);
        System.out.println("Decimal number is: " +c);
    }
}
