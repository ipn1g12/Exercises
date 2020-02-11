public class w3resource_27 {
    public static void main(String[] args) {
        String octal_num, hex_num;
        int decnum;
        octal_num = "100";

        decnum = Integer.parseInt(octal_num, 8);
        hex_num = Integer.toHexString(decnum);
        System.out.println("Octal number is: " +octal_num);
        System.out.print("Equivalent hexadecimal number: "+ hex_num+"\n");
    }
}
