package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _7Day_DFS1 {
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        arr = new int[n+1][r+1];
        System.out.println(DFS(n, r));
    }
    static int DFS(int n, int r){
        if (arr[n][r] != 0) return arr[n][r];
        if (n == r || r == 0){
            return 1;
        }else{
            return arr[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
        }
    }
}