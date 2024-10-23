import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer index for the Fibonacci sequence: ");

        String input = scanner.nextLine();

        System.out.println("You entered: " + input);

        try 
            {
            int index = Integer.parseInt(input);

            if (index < 0) 
            {
                System.out.println("Please enter a non-negative integer.");
            } 
            else 
            {
                long fibonacciNumber = fibonacci(index);
                System.out.println("Fibonacci number at index " + index + " is: " + fibonacciNumber);
            }
        } 
        catch (NumberFormatException e) 
            {
            System.out.println("Please enter a valid integer.");
        }

        scanner.close();
    }

    public static long fibonacci(int n) 
    {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) 
        {
            fib = a + b; 
            a = b;       
            b = fib;     
        }
        return fib;
    }
}