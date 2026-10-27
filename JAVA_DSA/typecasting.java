public class typecasting {
    public static void main(String[] args) {
        // Implicit typecasting

        int a = 10;
        long longNum = a; // int to long
        System.out.println("Long: " + longNum);

        // Explicit typecasting
        long longValue = 10000000L;
        int intValue = (int) longValue; // long to int
        System.out.println("Integer: " + intValue);
    }
}
