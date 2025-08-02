package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DFS_13 {
    static int[] arr;
    static int n, m;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        DFS(0,1);
    }
    static void DFS(int v, int start){
        if(v == m){
            for(int i = 0 ; i < m ; i ++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }else{
            for(int i = start; i <= n; i ++){
                arr[v] = i;
                DFS(v + 1, i + 1);
            }
        }
    }
}