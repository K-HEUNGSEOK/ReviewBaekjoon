package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_1 {
    static int n ,m;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] ch;
    static int[] dist;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        // 1.입력받기
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new boolean[n + 1];
        dist = new int[n + 1];
        graph = new ArrayList<>();
        for(int i = 0 ; i <= n ; i ++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0 ; i < m ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        //2. 호출
        BFS(1);
        for(int i = 2 ; i <= n ; i ++){
            System.out.println(i + " :" + dist[i]);
        }
    }
    static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        ch[v] = true;
        int index = 0;
        int l = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0 ; i < len ; i ++){
                Integer num = queue.poll();

                for (int nx : graph.get(num)) {
                    if (!ch[nx]){
                        ch[nx] = true;
                        dist[nx] = dist[num] + 1;
                        queue.offer(nx);
                    }
                }
            }
        }
    }
}