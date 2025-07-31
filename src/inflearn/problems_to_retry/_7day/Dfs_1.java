package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dfs_1 {
    static int n;
    static boolean[] ch;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new boolean[n +1];
        DFS(1);
    }
    static void DFS(int v){
        if (v == n+1 ){
            for(int i = 1; i <= n ; i++){
                if (ch[i]){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }else{
            ch[v] = true;
            DFS(v+ 1);
            ch[v] = false;
            DFS(v + 1);
        }
    }
}