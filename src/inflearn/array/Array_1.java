package inflearn.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(arr[0] + " ");
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                System.out.print(arr[i] + " ");

            }
        }
    }
}