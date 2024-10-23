import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();
        
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        int sumFormula = n * (n + 1) / 2;
        
        System.out.println("The sum of the first " + n + " natural numbers is: " + sumFormula);
        
        scanner.close();
    }
}
