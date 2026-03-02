import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.println("Enter three numbers:");
        
        System.out.print("Enter number 1: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter number 2: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter number 3: ");
        double num3 = scanner.nextDouble();
        
        // Create Math object
        Math math = new Math(num1, num2, num3);
        
        // Run all methods and display results
        System.out.println("\n=== Results ===");
        System.out.println("Numbers entered: " + num1 + ", " + num2 + ", " + num3);
        
        // Addition
        System.out.println("Addition (sum): " + math.add());
        
        // Division
        System.out.println("Division (" + num1 + " + " + num2 + ") / " + num3 + " = " + math.divide());
        
        // Multiplication
        System.out.println("Multiplication (" + num1 + " * " + num2 + " * " + num3 + ") = " + math.multiple());
        
        scanner.close();
    }
}
