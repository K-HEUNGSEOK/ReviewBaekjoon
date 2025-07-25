package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DFS_7 {
    static int n, m, ans;
    static int[] score;
    static int[] time;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        score = new int[n];
        time = new int[n];
        ans = 0;
        for(int i =0 ; i < n ;i ++){
            int s = sc.nextInt();
            int t = sc.nextInt();
            score[i] = s;
            time[i] = t;
        }
        DFS(0, 0, 0);
        System.out.println(ans);
    }
    static void DFS(int v, int s, int t){
        if (t > m) return;
        if (v >= n){
            ans = Math.max(ans,s);
            return;
        }else{
            DFS(v + 1 , s + score[v], t + time[v]);
            DFS(v+1 , s, t);
        }
    }
}