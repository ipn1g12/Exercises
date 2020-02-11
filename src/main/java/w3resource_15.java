public class w3resource_15 {
    public static void main (String[] args) {
        int a = 12;
        int b = 23;
        System.out.println("a=" + a + " b=" + b);
        System.out.println("...Swap");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + " b=" + b);
    }
}
