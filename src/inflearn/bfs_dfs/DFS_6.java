package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class DFS_6 {
        static int n, m, ans;
        static int[] score;
        static int[] time;
        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            m = sc.nextInt();
            ans = 0;
            score = new int[n];
            time = new int[n];
            for(int i = 0 ; i < n ; i ++){
                int s = sc.nextInt();
                int t = sc.nextInt();
                score[i] = s;
                time[i] = t;
            }
            DFS(0,0, 0);
            System.out.println(ans);
        }
        static void DFS(int v, int sum, int t){
            if (t > m) return;
            if (v == n){
                ans = Math.max(ans, sum);
                return;
            }else{
                DFS(v + 1, sum + score[v], t + time[v]);
                DFS(v + 1, sum, t);
            }
        }
    }