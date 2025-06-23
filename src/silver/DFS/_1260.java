package silver.DFS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class _1260 {
    static int n, m, s;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] ch;

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        ch = new boolean[n + 10];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }
        DFS(s);
        System.out.println();
        BFS(s);
    }

    static void DFS(int v) {
        if (v > n) {
            return;
        } else {
            ch[v] = true;
            System.out.print(v + " ");
            for (Integer nx : graph.get(v)) {
                if (!ch[nx]) {
                    ch[nx] = true;
                    DFS(nx);
                }
            }
        }
    }

    static void BFS(int v) {
        ch = new boolean[n + 10];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        ch[v] = true;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Integer nx = queue.poll();
                System.out.print(nx + " ");
                for (Integer num : graph.get(nx)) {
                    if (!ch[num]) {
                        ch[num] = true;
                        queue.offer(num);
                    }
                }
            }
        }
    }
}