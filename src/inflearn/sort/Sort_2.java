package inflearn.sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sort_2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n-1 ; i ++){
            int min = arr[i], k = i;
            for(int j = i + 1; j < n ; j ++){
                if (min > arr[j]){
                    min = arr[j];
                    k = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[k] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}