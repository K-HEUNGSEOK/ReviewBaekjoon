package silver.DFS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class _2644 {
    static int n, start, target, m ,ans;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] ch;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        start = sc.nextInt();
        target = sc.nextInt();
        m = sc.nextInt();
        ans = -1;
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
        DFS(start,0);
        System.out.println(ans);
    }
    static void DFS(int v, int l){
        if (v == target){
            ans = l;
            return;
        }else{
            ch[v] = true;
            for (Integer nx : graph.get(v)) {
                if (!ch[nx]){
                    ch[nx] = true;
                    DFS(nx,l + 1);
                }
            }
        }
    }
}