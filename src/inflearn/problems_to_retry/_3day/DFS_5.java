package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DFS_5 {
    static int n, sum;
    static int[] arr;
    static boolean check = false;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        //인덱스 , 합
        DFS(0,0);
        if (check){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    static void DFS(int v, int total){
        if (check) return;
        if (total > sum / 2) return;
        if (v >= n){
            if (total*2 == sum){
                check = true;
                return;
            }
        }
        else{
            DFS(v + 1 , total + arr[v]);
            DFS(v + 1, total);
        }
    }
}