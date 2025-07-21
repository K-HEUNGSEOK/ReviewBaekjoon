package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class Sort_6 {

        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            int sum= 0;
            for(int i = 0 ; i < n ; i ++) {
                arr[i] = sc.nextInt();
                sum +=arr[i];
            }
            int lt = 0;
            int rt = sum + 1;
            int ans = 0;
            while (lt + 1 < rt){
                int mid = (lt+rt) /2;
                int total = 0;
                int cnt = 1;
                for(int i = 0; i < n ; i ++){
                    if (total + arr[i] > mid){
                        cnt ++;
                        total = arr[i];
                    }else{
                        total += arr[i];
                    }
                }
                if (cnt <= m){
                    rt = mid;
                    ans = mid;
                }else{
                    lt = mid;
                }
            }
            System.out.println(ans);
        }
    }