package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _7_Day_DFS2 {
    static int[] b , p, ch;
    static int n ,f;
    static boolean flag = false;
    static int[][] graph = new int[35][35];
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n]; //경우의 수 배열
        p = new int[n]; //수열을 담는 배열
        ch = new int[n + 1];
        for(int i = 0 ; i < n ; i ++){
            b[i] = combi(n-1,i);
        }
        DFS(0,0);
    }
    static int combi(int n, int r){
        if (graph[n][r] != 0) return graph[n][r];
        if (n == r || r == 0) return 1;
        else{
            return graph[n][r] = combi(n-1,r-1) + combi(n-1,r);
        }
    }
    static void DFS(int l ,int sum){
        if (flag) return;
        if (sum > f) return;
        if (l == n){
            if (sum == f){
                for (int i : p) {
                    System.out.print(i + " ");
                }
            }
            flag = true;
            return;
        }else{
            for(int i = 1; i <= n ; i++){
                if (ch[i] == 0){
                    ch[i] = 1;
                    p[l] = i ;
                    DFS(l + 1, sum + (p[l] * b[l]));
                    ch[i] = 0;
                }
            }
        }
    }
}