package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _14Day_DFS_3 {
    static int n,total;
    static boolean flag;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        total = 0;
        flag = false;
        arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        DFS(0, 0);
        if (flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    static void DFS(int v, int sum){
        if (flag) return;
        if (v == n){
            if (sum > total - sum) return;
            if (sum == total - sum){
                flag = true;
                return;
            }
        }else{
            DFS(v + 1, sum + arr[v]);
            DFS(v + 1, sum);
        }
    }
}