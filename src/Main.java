import java.io.FileNotFoundException;
import java.util.*;
public class Main {
    static int n, m, cnt;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] ch;
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        cnt = 0;
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i <= n ; i ++){
            graph.add(new ArrayList<>());
        }
        ch = new boolean[n + 10];
        for(int i = 0 ; i < m ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        DFS(1);
        System.out.println(cnt);
    }
    static void DFS(int v){
        if(v > n){
            return;
        }else{
            ch[v] = true;
            for (Integer nx : graph.get(v)) {
                if (!ch[nx]){
                    ch[nx] = true;
                    cnt ++;
                    DFS(nx);
                }
            }
        }
    }
}