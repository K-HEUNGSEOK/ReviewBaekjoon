package inflearn.problems_to_retry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_retry {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <=5; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = 0; //정답 번호
        int max = 0; // 가장 큰 앨 찾는거임
        for(int i = 1 ; i <= n; i++){
            int cnt = 0;
            for(int j = 1; j <=n ; j ++){
                for(int k = 1; k <= 5; k ++){
                    if (arr[i][k] == arr[j][k]){
                        cnt ++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}