package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

    public class DFS_3 {
        static ArrayList<ArrayList<Integer>> graph;
        static int n , m , cnt;
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
            ch = new boolean[n + 1];

            for(int i = 0 ; i < m ; i ++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph.get(a).add(b);
            }
            ch[1] = true;
            DFS(1);
            System.out.println(cnt);
        }
        static void DFS(int v){
            if (v == n ){
                cnt ++;
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