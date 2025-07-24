package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DFS_7 {
    static int n, ans;
    static int[] arr;
    static int m;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0 ; i < n ; i ++) arr[i]  =sc.nextInt();
        m = sc.nextInt();
        ans = Integer.MAX_VALUE;
        //3개를 뻗으면서 cnt를 같이 올리고 15가 되는 순간에 멈추면 되겠네?
        DFS(0,0);
        System.out.println(ans);
    }
    static void DFS(int sum, int cnt){
        if (cnt >= ans) return;
        if (sum > m) return;
        if (sum == m){
            ans = Math.min(ans,cnt);
            return;
        }else{
            for(int i = 0 ; i < n ; i ++){
                DFS(sum + arr[i], cnt + 1);
            }
        }
    }
}