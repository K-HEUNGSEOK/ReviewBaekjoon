package inflearn.sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_10 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for(int i = 0 ; i < n ; i ++){
            int x = sc.nextInt();
            arr[i] = x;
            max = Math.max(max, x);
        }
        Arrays.sort(arr);

        int lt = 0, rt = max;
        int ans = Integer.MAX_VALUE;
        while (lt + 1 < rt){
            int cnt = 1; //m 마리의 말을 배치
            int ep = arr[0];
            int mid = (lt + rt) / 2; //가장 가까운 거리를 mid라고 생각

            for(int i = 1; i < n ; i ++){
                //새로 배치하는 것과 그 전 말의 거리가 mid 랑 크거나 같으면 배치
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