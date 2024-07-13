import java.util.Scanner;

public class Product_A_B {
    public static int multiply(int a, int b) {
        a++;
        b += 8;
        System.out.println("Multiplication of two numbers is: " + a * b);
        int prod = a * b;
        return prod;
    }

    public static int inputNumber() {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }

    public int factCalculate(int input) {
        int fact = 1;
        for (int i = input; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        // Call by value - Changes will not be reflected in the main function
        int a = 7;
        int b = 2;
        multiply(a, b);
        System.out.println(a * b);

        // Object Creation
        int input = inputNumber();
        Product_A_B obj = new Product_A_B();
        int fact = obj.factCalculate(input);
        System.out.println("Factorial of " + input + " is: " + fact);
    }
}
