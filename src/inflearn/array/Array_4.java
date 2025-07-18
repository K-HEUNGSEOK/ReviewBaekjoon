package inflearn.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        arr[1] = 1;
        arr[2] = 1;
        for(int i = 2; i <= n ; i ++) {
            arr[i] = arr[i - 1] + arr[i-2];
        }
        for(int i = 1 ; i <= n ; i ++){
            System.out.print(arr[i] + " ");
        }
    }
}