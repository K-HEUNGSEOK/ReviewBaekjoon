package inflearn.problems_to_retry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_retry_1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // 학생 수
        int n = sc.nextInt(); // 시험 수
        int[][] arr = new int[n][m];

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for(int i = 1; i <= m ; i ++){
            for(int j = 1; j <= m ; j ++){
                if (i == j) continue;
                int cnt = 0;
                for(int k = 0; k < n ; k ++){
                    int pi = 0, pj = 0;
                    for(int l = 0 ; l < m ; l ++){
                        if (arr[k][l] == i){
                            pi = l;
                        }
                        if (arr[k][l] == j){
                            pj = l;
                        }
                    }
                    if (pi < pj){
                        cnt ++;
                    }
                }
                if (cnt == n){
                    ans ++;
                }
            }
        }
        System.out.println(ans);
    }
}