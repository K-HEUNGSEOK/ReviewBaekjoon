package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

    public class Sort_7 {

        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum = 0 ;
            int [] arr = new int[n];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
                sum = Math.max(sum,arr[i]);
            }
            Arrays.sort(arr);
            int lt = 0 , rt = sum;
            int ans = 0;
            while (lt + 1 < rt){
                int mid = (lt + rt) / 2;
                int cnt = 1;
                int ep = arr[0];
                for(int i = 0 ; i < n ; i ++){
                    if (arr[i] - ep >= mid){
                        cnt ++;
                        ep = arr[i];
                    }
                }
                if (cnt == m){
                    ans = mid;
                }

                if (cnt >= m){
                    lt = mid;
                    ans = mid;
                }else{
                    rt = mid;
                }
            }
            System.out.println(ans);
        }
    }