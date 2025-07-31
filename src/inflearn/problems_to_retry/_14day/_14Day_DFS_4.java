package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _14Day_DFS_4 {
    static int c, n, ans;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        ans = 0;
        DFS(0,0);
        System.out.println(ans);
    }
    static void DFS(int v , int total){
        if (v == n){
            if (total > c) return;
            ans = Math.max(ans, total);
        }else{
            DFS(v+1, total + arr[v]);
            DFS(v + 1, total );
        }
    }
}