package inflearn.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int cnt = 1;
        for(int i = 1; i < n ; i ++){
            if (max < arr[i]){
                max = arr[i];
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}