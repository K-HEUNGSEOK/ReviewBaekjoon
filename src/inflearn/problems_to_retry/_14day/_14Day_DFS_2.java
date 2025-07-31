package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _14Day_DFS_2 {
    static ArrayList<Integer>[] graph;
    static boolean[] ch;
    static int[] dist;
    static int n,m;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new boolean[n + 1];
        dist = new int[n+1];
        graph = new ArrayList[n+1];
        for(int i = 0 ; i <=n ; i++)graph[i] = new ArrayList<>();

        for(int i = 0 ; i < m ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
        }
        BFS(1);
        for(int i = 2; i <= n ; i++){
            System.out.println(i + " : " + dist[i]);
        }
    }
    static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        ch[v] = true;
        int l = 1;
        while (!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0 ; i < len; i ++){
                int num = queue.poll();

                for(int nx : graph[num]){
                    if (!ch[nx]){
                        ch[nx] = true;
                        queue.offer(nx);
                        dist[nx] = l;
                    }
                }
            }
            l ++;
        }
    }
}