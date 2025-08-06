package inflearn.greedy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Greedy_6 {
    static int[] unf;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n + 1];
        for(int i = 1; i <= n ; i ++) unf[i] = i;
        for(int i = 0 ; i < m ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a,b);
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (find(a) == find(b)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    static void union(int a, int b){
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) unf[fa] = fb;
    }
    static int find(int v){
        if (v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }
}