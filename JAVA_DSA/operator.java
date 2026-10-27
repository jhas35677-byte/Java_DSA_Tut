class operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators -->to perform mathematical operations
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators-->To compare two values
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        // Logical Operators-->To combine multiple conditions
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Assignment Operators-->To assign values to variables
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("Assignment Addition: " + c);

        //unary Operators-->To perform operations on a single operand
        int d = 10;

        //Preincrement and Predecrement
        System.out.println("Unary Increment: " + (++d)); // Pre-increment
        System.out.println("Unary Decrement: " + (--d)); // Pre-decrement

        //postincrement and postdecrement
        int f = 10;
        System.out.println("Post Increment: " + (f++)); // Post-increment
        System.out.println("Post Decrement: " + (f--)); // Post-decrement



        //Ternary Operators-->To evaluate a condition and return one of two values
        int e = 15;
        String result = (e > 10) ? "Greater than 10" : "Less than or equal to 10";
        System.out.println("Ternary Operator Result: " + result);
    }
}