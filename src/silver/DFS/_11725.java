package silver.DFS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class _11725 {
    static int n;
    static boolean[] ch;
    static int [] visited;
    static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new boolean[n + 10];
        visited = new int[n + 10];
        graph = new ArrayList<>();
        for(int i = 0 ; i <= n ; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < n-1; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        DFS(1);
        StringBuilder sb = new StringBuilder();
        for(int i =  2; i <= n ; i ++){
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);
    }
    static void DFS(int v){
        if (v > n){
            return;
        }else{
            ch[v] = true;
            for (int nx : graph.get(v)) {
                if (!ch[nx]){
                    ch[nx]= true;
                    visited[nx] = v;
                    DFS(nx);
                }
            }
        }
    }
}