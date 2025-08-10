package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Coin_DFS {
    static int n, ans, target;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = Integer.MAX_VALUE;
        arr = new int[n];
        for(int i = 0 ; i < n ; i ++) arr[i] = sc.nextInt();
        target = sc.nextInt();
        arr = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        DFS(0, 0,0);
        System.out.println(ans);
    }
    static void DFS(int v, int sum, int coin){
        if (v > n) return;
        if (sum > target) return;
        if (coin >= ans) return;
        if (sum == target){
                ans = coin;
        }else{
            for(int i = 0; i < n ; i ++){
                DFS(v + 1, sum + arr[i], coin +1);
            }
        }
    }
}