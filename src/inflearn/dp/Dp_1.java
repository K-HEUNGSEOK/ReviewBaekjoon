package inflearn.dp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Dp_1 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] dp = new int[n+ 1];
        for(int i = 1; i <= n ; i ++){
            arr[i]= sc.nextInt();
        }
        dp[1] = 1;
        //자기보다 작은애들중에 dp[j]의 값중 가장 큰것중에 +1 을 하면된다.
        //만약 아무것도 없으면 1이다.
        for(int i = 2; i <= n ; i ++){
            int m = 0;
            for(int j = i -1 ; j >= 1; j --){
                if (arr[i] > arr[j]){
                    if (dp[j] > m){
                        m = dp[j];
                    }
                }
            }
            dp[i] = m + 1;
        }


        int max = 0;
        for (int i : dp) {
            if (max < i){
                max = i;
            }
        }
        System.out.println(max);

    }
}