package inflearn.sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_8 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0 ; i < n ; i ++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        int lt = -1, rt = n+1;
        while (lt + 1 < rt){
            int mid = (lt + rt) / 2;

            if (arr[mid] == m){
                System.out.println(mid+1);
                break;
            }

            if (arr[mid] > m){
                rt = mid;
            }else{
                lt = mid;
            }

        }
    }
}