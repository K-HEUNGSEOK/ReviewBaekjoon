package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i = 1; i <= n ; i ++){
            for(int j = 1 ; j < 6 ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        //1. 세로로 체크하는데, 불리언 배열로 체크를 하고 토탈값을 봐야할듯
        int max = 0;
        int ans = 0;
        for(int i = 1 ; i <= n ; i ++){
            int cnt = 0;
            for(int j = 1 ; j <= n ; j ++){
                for(int k = 1 ; k < 6; k ++){
                    if (arr[i][k] == arr[j][k]){
                        cnt ++;
                        break;
                    }
                }
            }
            if (cnt > max){
                max = cnt;
                ans = i;
            }
        }
        System.out.println(ans);

    }
}