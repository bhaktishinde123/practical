import java.util.Scanner;

// Addition class
class Addition {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

// Subtraction class
class Subtraction {
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
}

// Multiplication class
class Multiplication {
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
}

// Division class
class Division {
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero!");
            return Double.NaN; // Indicate an undefined result
        }
    }
}

// CalculatorApp class with a static main method for user input and interaction
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Create instances of different operation classes
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        // Perform calculations using non-static methods
        int sum = addition.add(num1, num2);
        int difference = subtraction.subtract(num1, num2);
        int product = multiplication.multiply(num1, num2);
        double quotient = division.divide(num1, num2);

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        scanner.close();
    }
}
