package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DFS_1 {
    static int n;
    static boolean[] arr;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        //1부터 n 까지 갖는 부분집합, 이게 n이 되면 그때 배열확인해서 체크하는거같은데
        n = sc.nextInt();
        arr = new boolean[n+1];
        DFS(1);
    }
    static void DFS(int v){
        if (v == n+1){
            for(int i = 1; i <= n; i ++){
                if (arr[i]){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }else{
            arr[v] = true;
            DFS(v+1);
            arr[v] = false;
            DFS(v+1);
        }
    }
}