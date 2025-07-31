package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DFS_1 {
    static ArrayList<Integer>[] graph;
    static boolean[] ch;
    static int n,m,cnt;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        cnt = 0;
        ch = new boolean[n+1];
        graph = new ArrayList[n + 1];
        for(int i =0 ; i <= n ; i ++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < m ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
        }
        DFS(1);
        System.out.println(cnt);
    }
    static void DFS(int v){
        if (v == n){
            cnt ++;
        }else{
            ch[v] = true;
            for(Integer nx : graph[v]){
                if (!ch[nx]){
                    ch[nx] = true;
                    DFS(nx);
                    ch[nx] = false;
                }
            }
        }
    }
}