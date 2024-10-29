
import java.io.*;

class GFG {

    static void insertElement(int arr[], int n, int x, int pos) {
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = x;
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int n = 5;
        int x = 99;
        int pos = 2;

        System.out.print("Before Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        insertElement(arr, n, x, pos);

        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}