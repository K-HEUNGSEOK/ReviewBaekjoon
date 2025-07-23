package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];

        for(int i = 0; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for(int i = 1; i <= n ; i ++){
            for(int j = 1; j <=n ; j ++){
                if (i == j) continue;
                int ei = 0;
                int ej = 0;
                boolean flag = true;
                for(int k = 0 ; k < m ; k ++){
                    for(int l = 0; l < n ; l ++){
                        if (arr[k][l] == i){
                            ei = l;
                        }
                        if (arr[k][l] == j){
                            ej = l;
                        }
                    }
                    if (ei < ej){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    ans ++;
                }
            }
        }
        System.out.println(ans);
    }
}