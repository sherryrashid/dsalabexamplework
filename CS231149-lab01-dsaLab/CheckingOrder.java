import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int third = scanner.nextInt();

        String result = determineOrder(first, second, third);
        System.out.println("The numbers are in " + result + " order.");
    }

    private static String determineOrder(int first, int second, int third) {
        if (first < second && second < third) {
            return "increasing";
        } else if (first > second && second > third) {
            return "decreasing";
        } else {
            return "neither increasing nor decreasing";
        }
    }
}
