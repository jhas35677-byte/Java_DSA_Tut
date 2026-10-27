import java.util.Scanner;


class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first  number: ");
         int first_num= scanner.nextInt();
         System.out.print("Enter second number: ");
         int second_num= scanner.nextInt();
         int sum= first_num+second_num;
        
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}