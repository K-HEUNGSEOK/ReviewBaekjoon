package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class DFS_5 {
        static int c, n , ans;
        static int [] arr;
        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            c = sc.nextInt();
            n = sc.nextInt();
            arr = new int[n+1];
            ans = 0;

            for(int i = 0 ; i < n ; i ++ ){
                arr[i] = sc.nextInt();
            }
            DFS(0,0);
            System.out.println(ans);
        }
        static void DFS(int v, int total){
            if (total > c) return;
            if (v > n){
                ans = Math.max(ans, total);
            }else{
                DFS(v + 1 , total + arr[v]);
                DFS(v + 1 , total);
            }
        }
    }