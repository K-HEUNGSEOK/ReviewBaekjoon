package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DFS_8 {
    static int n, m,cnt;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] ch;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        cnt = 0;
        graph = new ArrayList<>();
        for(int i = 0 ; i <= n ; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0 ; i < m ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch = new boolean[n + 1];
        ch[1] = true;
        DFS(1);
        System.out.println(cnt);
    }
    static void DFS(int v){
        //종료 조건은 v 가 n에 가면 종료겠지
        if (v == n){
            cnt ++;
            return;
        }else{
            for (int nx : graph.get(v)) {
                if (!ch[nx]){
                    ch[nx] = true;
                    DFS(nx);
                    ch[nx] = false;
                }
            }
        }
    }
}