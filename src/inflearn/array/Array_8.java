package inflearn.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_8 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i ++){
            int cnt = 1;
            for(int j = 0 ; j < n ; j ++){
                if (i==j) continue;
                if (arr[i] < arr[j]){
                    cnt ++;
                }
            }
            System.out.print(cnt + " ");
        }
    }
}