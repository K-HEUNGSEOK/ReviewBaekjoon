package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DFS_1 {
    static int n,m, ans;
    static int[] wallet;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        // 동전을 포함하고 안하고를 나눠서 합이 가장 빠른애를 하면 될듯
        n = sc.nextInt();
        wallet = new int[n];
        for(int i = 0; i < n ; i ++){
            wallet[i] = sc.nextInt();
        }
        wallet = Arrays.stream(wallet).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue)
                .toArray();
        m = sc.nextInt();
        ans = Integer.MAX_VALUE;
        DFS(0, 0,0);
        System.out.println(ans);
    }
    static void DFS(int v, int total, int  cnt){
        if (total == m){
            ans = Math.min(ans, cnt);
            return;
        }

        if (total > m || cnt >= ans || v >= n){
            return;
        }else{
            DFS(v , total + wallet[v], cnt + 1);
            DFS(v + 1, total, cnt);
        }
    }
}