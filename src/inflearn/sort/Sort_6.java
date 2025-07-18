package inflearn.sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_6 {
    static int[] arr;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1 ; i <= n ; i ++)arr[i] = sc.nextInt();
        int[] copy = Arrays.copyOf(arr,n+1);
        Arrays.sort(copy);

        for(int i = 1; i <= n ; i ++){
            if (arr[i] != copy[i]){
                System.out.print(i + " ");
            }
        }
    }
}