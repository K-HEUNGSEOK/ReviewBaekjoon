package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DFS_3 {
    static int n , m;
    static int[] arr, box;
    static boolean[] ch;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        box = new int[n];
        for(int i = 0 ; i < n ;i ++) box[i] = sc.nextInt();
        ch = new boolean[n];
        DFS(0);
    }
    static void DFS(int v){
        if (v == m){
            for(int i = 0; i < m ; i ++){
                    System.out.print(arr[i] +" ");
            }
            System.out.println();
        }else{
            for(int i = 0 ; i < n ; i ++){
                if (!ch[i]){
                    ch[i] = true;
                    arr[v] = box[i];
                    DFS(v + 1);
                    ch[i] = false;
                }
            }
        }
    }
}