package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DFS_6 {
    static int c, n, ans;
    static int[] arr;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0 ; i < n ; i ++) arr[i] = sc.nextInt();
        ans = 0;
        DFS(0,0);
        System.out.println(ans);
    }
    static void DFS(int v, int sum){
        //BaseCase
        if (sum > c) return;
        if (v >= n){
            ans = Math.max(ans, sum);
            return;
        }
        else{
            DFS(v+1, sum + arr[v]);
            DFS(v+1, sum);
        }
    }
}