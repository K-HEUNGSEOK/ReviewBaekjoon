package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_7 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        int lt = 0 ;
        int rt = 0;
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
            rt = Math.max(rt, arr[i]);
        }
        Arrays.sort(arr);
        int ans =0;
        while (lt + 1 < rt){
            int mid = (lt + rt) / 2;
            int cnt = 1;
            int ep = arr[0];
            for(int i = 0 ; i < n; i ++){
                if (arr[i] - ep >= mid){
                    cnt ++;
                    ep = arr[i];
                }
            }
            if (cnt >= m){
                ans = mid;
                lt = mid;
            }else{
                rt = mid;
            }
        }
        System.out.println(ans);
    }
}