package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _14Day_DFS_5 {
    static int n, m;
    static int[] score;
    static int[] time;
    static int ans;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        score = new int[n];
        time = new int[n];
        for(int i = 0 ; i < n ; i ++){
            int s=  sc.nextInt();
            int t= sc.nextInt();
            score[i] = s;
            time[i] = t;
        }
        ans = 0;
        DFS(0,0, 0);
        System.out.println(ans);
    }
    static void DFS(int v, int total, int t){
        if (v == n){
            if (t > m) return;
            ans = Math.max(ans,total);
        }else{
            DFS(v+1, total + score[v], t + time[v]);
            DFS(v+1, total, t);
        }
    }
}