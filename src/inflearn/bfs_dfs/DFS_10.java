package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DFS_10 {
    static int[] b, p;
    static boolean[] ch;
    static int n,f;
    static int[][] dy = new int[35][35];
    static boolean flag =  false;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new boolean[n + 1];
        for(int i = 0 ; i < n ; i ++){
            b[i] = DFS(n-1, i); //콤비네이션을 미리 구함
        }
        Test(0,0);
        System.out.println();
    }
    static void Test(int v , int sum){
        if (flag) return;
        if (v > n) return;
        if (v == n){
            if (sum == f){
                flag = true;
                for(int i = 0 ; i < n ; i ++){
                    System.out.print(p[i] + " ");
                }
                return;
            }
        }else{
            for(int i = 1; i <= n ; i ++){
                if (!ch[i]){
                    ch[i] = true;
                    p[v] = i;
                    Test(v + 1, sum + (p[v] * b[v]));
                    ch[i] = false;
                }
            }
        }
    }

    static int DFS(int n , int r){
        if (dy[n][r] != 0) return dy[n][r];
        if (n == r || r == 0){
            return 1;
        }
        else{
            return dy[n][r] = DFS(n-1,r-1) + DFS(n-1,r);
        }
    }
}