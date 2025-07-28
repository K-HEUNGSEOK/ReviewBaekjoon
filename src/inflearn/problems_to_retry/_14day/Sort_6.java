package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Sort_6 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int lt = 0;
        int rt = 0;
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
            rt += arr[i];
        }
        rt += 1;
        int ans = Integer.MAX_VALUE;
        while (lt + 1 < rt){
            int mid = (rt + lt) / 2;
            int sum = 0;
            int cnt = 1;
            for(int i = 0 ; i < n ; i ++){
                if (sum + arr[i] > mid){
                    cnt ++;
                    sum = arr[i];
                }else{
                    sum += arr[i];
                }
            }
            if (cnt <= m){
                ans = mid;
                rt = mid;
            }else{
                lt = mid;
            }
        }
        System.out.println(ans);
    }
}