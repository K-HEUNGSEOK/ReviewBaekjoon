package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

    public class BFS_4 {
        static ArrayList<ArrayList<Integer>> graph;
        static int[] ch;
        static int n ,m;
        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            //1번부터 각 번호마다 최소 번호 수 를 출력해라
            n = sc.nextInt();
            m = sc.nextInt();
            graph = new ArrayList<>();
            for(int i = 0 ; i <=n ; i ++){
                graph.add(new ArrayList<>());
            }
            ch = new int[n+1];
            for(int i = 0 ; i < m ; i ++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph.get(a).add(b);
            }
            BFS(1);
            for(int i = 2; i <= n ; i ++){
                System.out.println(i + " " + ch[i]);
            }
        }
        static void BFS(int v){
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(v);
            int l = 0;
            while (!queue.isEmpty()){
                int len = queue.size();
                for(int i = 0; i < len ; i ++){
                    Integer poll = queue.poll();

                    for (int nx : graph.get(poll)) {
                        if (ch[nx] == 0){
                            ch[nx] = l + 1;
                            queue.offer(nx);
                        }
                    }
                }
                l ++;
            }
        }
    }