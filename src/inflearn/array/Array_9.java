package inflearn.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_9 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
           for(int j = 0 ; j < n ; j ++){
               arr[i][j] = sc.nextInt();
           }
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            int sum = 0;
            for(int j = 0; j < n ; j ++){
                sum += arr[i][j];
            }
            ans = Math.max(ans,sum);
        }

        for(int i = 0 ; i < n ; i ++){
            int sum  = 0;
            for(int j = 0 ; j < n ; j ++){
                sum += arr[j][i];
            }
            ans = Math.max(ans,sum);
        }
        int sum1 = 0;
        for(int i = 0 ; i < n ; i ++){
            sum1 += arr[i][i];
        }
        ans = Math.max(ans,sum1);
        //0 5
        //1 4
        //2 3
        int sum2 = 0;
        for(int i = 0 ; i < n ; i ++){
            sum2 += arr[i][n-i-1];
        }
        ans = Math.max(ans,sum2);
        System.out.println(ans);
    }
}