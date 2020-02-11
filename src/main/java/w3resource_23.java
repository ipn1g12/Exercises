public class w3resource_23 {
    public static void main(String[] args) {
        long num = 1101;
        int decimal = convertBinaryToDecimal(num);
        String hex = Integer.toHexString(decimal);
        System.out.println("Binary = " + num + "\nHexadecimal = " + hex.toUpperCase());
    }
    public static int convertBinaryToDecimal(long num)
    {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (num != 0)
        {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
}
